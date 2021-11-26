package com.kodilla.testing.forum.statistics;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;


import java.util.List;
import java.util.ArrayList;

@ExtendWith(MockitoExtension.class)
public class TestStats {

    @Mock
    private Statistics stats;

    public void prepTest(int namesCount, int postsCount, int commentsCount){
        List<String> names = new ArrayList<>();
        for(int i=0; i!=namesCount;++i)
            names.add("Name "+i);
        when(stats.usersNames()).thenReturn(names);
        when(stats.postsCount()).thenReturn(postsCount);
        when(stats.commentsCount()).thenReturn(commentsCount);
    }

    @Test
    public void testCalculateAdvStatistics0Posts(){
        prepTest(10, 0, 0);
        CalcStats test = new CalcStats();
        test.calculateAdvStatistics(stats);
        //When
        double meanPostCountPerUser = (double)stats.postsCount() / stats.usersNames().size();
        double meanCommentCountPerUser = (double)stats.commentsCount() / stats.usersNames().size();
        double meanCommentCountPerPost = -1.;
        test.showStatistics();
        //Then
        Assertions.assertEquals(meanPostCountPerUser, test.getMeanPostCountPerUser());
        Assertions.assertEquals(meanCommentCountPerUser, test.getMeanCommentCountPerUser());
        Assertions.assertEquals(meanCommentCountPerPost, test.getMeanCommentCountPerPost());
    }

    @Test
    public void testCalculateAdvStatistics1000Posts(){
        //Given
        prepTest(40, 1000, 10000);
        CalcStats test = new CalcStats();
        test.calculateAdvStatistics(stats);
        //When
        double meanPostCountPerUser = (double)stats.postsCount() / stats.usersNames().size();
        double meanCommentCountPerUser = (double)stats.commentsCount() / stats.usersNames().size();
        double meanCommentCountPerPost = (double)stats.commentsCount() / stats.postsCount();
        test.showStatistics();
        //Then
        Assertions.assertEquals(meanPostCountPerUser, test.getMeanPostCountPerUser());
        Assertions.assertEquals(meanCommentCountPerUser, test.getMeanCommentCountPerUser());
        Assertions.assertEquals(meanCommentCountPerPost, test.getMeanCommentCountPerPost());
    }

    @Test
    public void testCalculateAdvStatistics0Comments(){
        //Given
        prepTest(10, 20, 0);
        CalcStats test = new CalcStats();
        test.calculateAdvStatistics(stats);
        //When
        double meanPostCountPerUser = (double)stats.postsCount() / stats.usersNames().size();
        double meanCommentCountPerUser = (double)stats.commentsCount() / stats.usersNames().size();
        double meanCommentCountPerPost = (double)stats.commentsCount() / stats.postsCount();
        test.showStatistics();
        //Then
        Assertions.assertEquals(meanPostCountPerUser, test.getMeanPostCountPerUser());
        Assertions.assertEquals(meanCommentCountPerUser, test.getMeanCommentCountPerUser());
        Assertions.assertEquals(meanCommentCountPerPost, test.getMeanCommentCountPerPost());
    }

    @Test
    public void testCalculateAdvStatisticsMoreCommentsThanPosts(){
        //Given
        prepTest(30, 20, 40);
        CalcStats test = new CalcStats();
        test.calculateAdvStatistics(stats);
        //When
        double meanPostCountPerUser = (double)stats.postsCount() / stats.usersNames().size();
        double meanCommentCountPerUser = (double)stats.commentsCount() / stats.usersNames().size();
        double meanCommentCountPerPost = (double)stats.commentsCount() / stats.postsCount();
        test.showStatistics();
        //Then
        Assertions.assertEquals(meanPostCountPerUser, test.getMeanPostCountPerUser());
        Assertions.assertEquals(meanCommentCountPerUser, test.getMeanCommentCountPerUser());
        Assertions.assertEquals(meanCommentCountPerPost, test.getMeanCommentCountPerPost());
    }

    @Test
    public void testCalculateAdvStatisticsMorePostsThanComments(){
        //Given
        prepTest(10, 20, 10);
        CalcStats test = new CalcStats();
        test.calculateAdvStatistics(stats);
        //When
        double meanPostCountPerUser = (double)stats.postsCount() / stats.usersNames().size();
        double meanCommentCountPerUser = (double)stats.commentsCount() / stats.usersNames().size();
        double meanCommentCountPerPost = (double)stats.commentsCount() / stats.postsCount();
        test.showStatistics();
        //Then
        Assertions.assertEquals(meanPostCountPerUser, test.getMeanPostCountPerUser());
        Assertions.assertEquals(meanCommentCountPerUser, test.getMeanCommentCountPerUser());
        Assertions.assertEquals(meanCommentCountPerPost, test.getMeanCommentCountPerPost());
    }

    @Test
    public void testCalculateAdvStatistics0Users(){
        //Given
        prepTest(0, 0, 0);
        CalcStats test = new CalcStats();
        test.calculateAdvStatistics(stats);
        //When
        double meanPostCountPerUser = -1.0;
        double meanCommentCountPerUser = -1.0;
        double meanCommentCountPerPost = -1.0;
        test.showStatistics();
        //Then
        Assertions.assertEquals(meanPostCountPerUser, test.getMeanPostCountPerUser());
        Assertions.assertEquals(meanCommentCountPerUser, test.getMeanCommentCountPerUser());
        Assertions.assertEquals(meanCommentCountPerPost, test.getMeanCommentCountPerPost());
    }

    @Test
    public void testCalculateAdvStatistics1000Users(){
        //Given
        prepTest(1000, 10000, 400000);
        CalcStats test = new CalcStats();
        test.calculateAdvStatistics(stats);
        //When
        double meanPostCountPerUser = (double)stats.postsCount() / stats.usersNames().size();
        double meanCommentCountPerUser = (double)stats.commentsCount() / stats.usersNames().size();
        double meanCommentCountPerPost = (double)stats.commentsCount() / stats.postsCount();
        test.showStatistics();
        //Then
        Assertions.assertEquals(meanPostCountPerUser, test.getMeanPostCountPerUser());
        Assertions.assertEquals(meanCommentCountPerUser, test.getMeanCommentCountPerUser());
        Assertions.assertEquals(meanCommentCountPerPost, test.getMeanCommentCountPerPost());
    }

}
