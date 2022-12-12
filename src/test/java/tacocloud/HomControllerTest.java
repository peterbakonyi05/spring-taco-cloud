package tacocloud;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import tacocloud.data.IngredientRepository;
import tacocloud.data.OrderRepository;
import tacocloud.data.TacoRepository;

@SpringBootTest
@AutoConfigureMockMvc
public class HomControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private IngredientRepository ingredientRepository;

    @MockBean
    private TacoRepository designRepository;

    @MockBean
    private OrderRepository orderRepository;

    @org.junit.jupiter.api.Test
    public void testHomePage() throws Exception {
        mockMvc.perform((get("/")))
                .andExpect(status().isOk())
                .andExpect(view().name("home"))
                .andExpect(content().string(containsString("Welcome to...")));
    }

}
