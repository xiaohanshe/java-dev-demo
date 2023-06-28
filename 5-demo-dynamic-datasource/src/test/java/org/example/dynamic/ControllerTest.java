package org.example.dynamic;

import org.example.dynamic.controller.DynamicDemoController;
import org.example.dynamic.entity.SysDatasourceConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import javax.annotation.Resource;
import java.util.*;

import static cn.hutool.core.map.MapUtil.empty;
import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * TODO
 *
 * @author han
 * @since 2023/06/28
 */
// @SpringBootTest
@WebMvcTest(controllers = DynamicDemoController.class)
public class ControllerTest {
    @Resource
    MockMvc mockMvc;

    @Test
    void test1() throws Exception {
        assertNotNull(mockMvc);
        List<SysDatasourceConfig> books = new ArrayList<>();
        // when(repository.findBooksByReader(any())).thenReturn(books);

        mockMvc.perform(MockMvcRequestBuilders.get("/dynamic/test"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("readingList"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("books"))
                .andExpect(MockMvcResultMatchers.model().attribute("books", is(empty())));
    }
}
