package com.kodilla.testing.forum.statistics;

public class CalcStats {

    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double meanPostCountPerUser;
    private double meanCommentCountPerUser;
    private double meanCommentCountPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        this.usersCount = statistics.usersNames().size();
        this.postsCount = statistics.postsCount();
        this.commentsCount = statistics.commentsCount();
        this.meanPostCountPerUser = (this.usersCount != 0)?
                            (double)this.postsCount / this.usersCount : -1.;
        this.meanCommentCountPerUser = (this.usersCount != 0)?
                            (double)this.commentsCount / this.usersCount : -1.;
        this.meanCommentCountPerPost = (this.postsCount != 0)?
                            (double)this.commentsCount / this.postsCount : -1.;
    }

    public void showStatistics(){
        System.out.println("Users count: " + this.usersCount);
        System.out.println("Posts count: " + this.postsCount);
        System.out.println("Comments count: " + this.commentsCount);
        System.out.println("Mean post count per user: " + this.meanPostCountPerUser);
        System.out.println("Mean comment count per user: " + this.meanCommentCountPerUser);
        System.out.println("Mean comment count per post: " + this.meanCommentCountPerPost);
    }

    public int getUsersCount() {
        return usersCount;
    }

    public void setUsersCount(int usersCount) {
        this.usersCount = usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public void setPostsCount(int postsCount) {
        this.postsCount = postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(int commentsCount) {
        this.commentsCount = commentsCount;
    }

    public double getMeanPostCountPerUser() {
        return meanPostCountPerUser;
    }

    public void setMeanPostCountPerUser(double meanPostCountPerUser) {
        this.meanPostCountPerUser = meanPostCountPerUser;
    }

    public double getMeanCommentCountPerUser() {
        return meanCommentCountPerUser;
    }

    public void setMeanCommentCountPerUser(double meanCommentCountPerUser) {
        this.meanCommentCountPerUser = meanCommentCountPerUser;
    }

    public double getMeanCommentCountPerPost() {
        return meanCommentCountPerPost;
    }

    public void setMeanCommentCountPerPost(double meanCommentCountPerPost) {
        this.meanCommentCountPerPost = meanCommentCountPerPost;
    }
}
