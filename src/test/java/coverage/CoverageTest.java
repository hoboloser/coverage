 package coverage;

import static org.junit.Assert.*;

import org.junit.Test;

import com.binh.coverage.CoverageTestService;
import com.binh.coverage.impl.CoverageTestServiceImpl;

public class CoverageTest {

    @Test
    public void test() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testMethod() {
        CoverageTestService service = new CoverageTestServiceImpl();
        service.methodOne(1, "t", true);
        service.methodOne(1, "t", false);
        service.methodOne(2, "t", false);
        
    }

}
