package com.nowcoder.community;

import com.nowcoder.community.util.MailClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;


/**
 * @Author Lyz
 * @Date: 2022/5/30 17:36
 * @Version 1.0
 */
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MailTests {

    @Autowired
    private MailClient mailClient;

    @Autowired
    private TemplateEngine templateEngine;

    @Test
    public void testTextMail() {
        mailClient.sendMail("coder6666@163.com","TEST","Welcome.");
    }
    @Test
    public void testHtmlMail() {
        Context context = new Context();
        context.setVariable("username", "sunday");
        String content = templateEngine.process("mail/demo", context);
        System.out.println(content);

        mailClient.sendMail("coder6666@163.com", "HTML",content);
    }
}
