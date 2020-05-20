package Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTests {

    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        System.out.println(job1.getId());
        System.out.println(job2.getId());
        assertEquals((job2.getId() - job1.getId()), 1);
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location(), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(testJob.getEmployer().toString(), "ACME");

        assertEquals(testJob.getCoreCompetency().toString(),"Persistence");

        assertEquals(testJob.getLocation().toString(), "Desert");

        assertEquals(testJob.getPositionType().toString(), "Quality control");

        assertEquals(testJob.getName(), "Product tester");


        assertFalse(testJob == testJob2);

        assertEquals(testJob.toString(), "" + testJob + "");

        assertEquals("\n" + "ID: 1" + "\n" + "Name: Product tester" + "\n" + "Employer: ACME" + "\n" + "Location: Desert" + "\n" + "Position Type: Quality control" + "\n" + "Core Competency: Persistence" + "\n", testJob.toString() );

        assertEquals("\n" + "ID: 2" + "\n" + "Name: Product tester" + "\n" + "Employer: ACME" + "\n" + "Location: Data not available" + "\n" + "Position Type: Quality control" + "\n" + "Core Competency: Persistence" + "\n", testJob2.toString() );


    }
}
