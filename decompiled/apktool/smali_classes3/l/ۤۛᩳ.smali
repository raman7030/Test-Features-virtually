.class public final Ll/ۤۛᩳ;
.super Ljava/lang/Object;
.source "X68P"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:Ll/ۙ֫ܿ;

.field public final synthetic ۙ:Ll/ۗ᩻᩵;

.field public ۫:I

.field public final synthetic ۬:Ll/᩸ۨᩳ;

.field public final synthetic ᩶:Ll/۫ۨᩳ;

.field public ᩸:Ll/ۗ᩻᩵;

.field public ᩹:Ll/ۗۤᩳ;


# direct methods
.method public constructor <init>(Ll/۫ۨᩳ;Ll/ۗ᩻᩵;Ll/᩸ۨᩳ;Ll/ۙ֫ܿ;)V
    .locals 0

    .line 3999
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤۛᩳ;->᩶:Ll/۫ۨᩳ;

    iput-object p2, p0, Ll/ۤۛᩳ;->ۙ:Ll/ۗ᩻᩵;

    iput-object p3, p0, Ll/ۤۛᩳ;->۬:Ll/᩸ۨᩳ;

    iput-object p4, p0, Ll/ۤۛᩳ;->ۗ:Ll/ۙ֫ܿ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 4010
    iget-object v0, p0, Ll/ۤۛᩳ;->᩶:Ll/۫ۨᩳ;

    iget-object v1, p0, Ll/ۤۛᩳ;->ۙ:Ll/ۗ᩻᩵;

    invoke-virtual {v1}, Ll/ۗ᩻᩵;->isDone()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    .line 4005
    iget-object v0, p0, Ll/ۤۛᩳ;->᩸:Ll/ۗ᩻᩵;

    if-eqz v0, :cond_0

    invoke-virtual {v0, v3}, Ll/ۗ᩻᩵;->cancel(Z)Z

    .line 4006
    :cond_0
    iput-object v4, p0, Ll/ۤۛᩳ;->᩸:Ll/ۗ᩻᩵;

    return-void

    .line 4012
    :cond_1
    iget-object v2, p0, Ll/ۤۛᩳ;->۬:Ll/᩸ۨᩳ;

    if-eqz v2, :cond_8

    :try_start_0
    invoke-static {v0}, Ll/۫ۨᩳ;->᩷֫(Ll/۫ۨᩳ;)Ll/᩸ۨᩳ;

    move-result-object v5

    if-ne v5, v2, :cond_8

    invoke-static {v0}, Ll/۫ۨᩳ;->ۙ(Ll/۫ۨᩳ;)Ll/۟᩺ᩳ;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v5, p0, Ll/ۤۛᩳ;->ۗ:Ll/ۙ֫ܿ;

    if-ne v2, v5, :cond_8

    :try_start_1
    invoke-static {v0}, Ll/۫ۨᩳ;->ۡ(Ll/۫ۨᩳ;)Z

    move-result v2

    if-nez v2, :cond_8

    .line 4014
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۤ֫()Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_7

    .line 4016
    iget-object v2, p0, Ll/ۤۛᩳ;->᩹:Ll/ۗۤᩳ;

    iget-object v6, v0, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    if-ne v2, v6, :cond_2

    iget v2, p0, Ll/ۤۛᩳ;->۫:I

    invoke-virtual {v5}, Ll/ۤ᩸ᩳ;->֨ۧ()I

    move-result v6

    if-ne v2, v6, :cond_2

    invoke-virtual {v0}, Ll/۫ۨᩳ;->۟ۧ()Z

    move-result v2

    if-nez v2, :cond_4

    .line 4005
    :cond_2
    iget-object v2, p0, Ll/ۤۛᩳ;->᩸:Ll/ۗ᩻᩵;

    if-eqz v2, :cond_3

    invoke-virtual {v2, v3}, Ll/ۗ᩻᩵;->cancel(Z)Z

    .line 4006
    :cond_3
    iput-object v4, p0, Ll/ۤۛᩳ;->᩸:Ll/ۗ᩻᩵;

    .line 4017
    :cond_4
    invoke-virtual {v0}, Ll/۫ۨᩳ;->۟ۧ()Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, v0, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual {v2}, Ll/ۗۤᩳ;->֡()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 4018
    iget-object v2, p0, Ll/ۤۛᩳ;->᩸:Ll/ۗ᩻᩵;

    if-nez v2, :cond_5

    .line 4019
    iget-object v2, v0, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    iput-object v2, p0, Ll/ۤۛᩳ;->᩹:Ll/ۗۤᩳ;

    .line 4020
    invoke-virtual {v5}, Ll/ۤ᩸ᩳ;->֨ۧ()I

    move-result v2

    iput v2, p0, Ll/ۤۛᩳ;->۫:I

    .line 4021
    invoke-virtual {v0, v5}, Ll/۫ۨᩳ;->ܽ(Ll/۟᩺ᩳ;)Ll/ۗ᩻᩵;

    move-result-object v0

    iput-object v0, p0, Ll/ۤۛᩳ;->᩸:Ll/ۗ᩻᩵;

    .line 4023
    :cond_5
    iget-object v0, p0, Ll/ۤۛᩳ;->᩸:Ll/ۗ᩻᩵;

    invoke-virtual {v0}, Ll/ۗ᩻᩵;->isDone()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 4024
    iget-object v0, p0, Ll/ۤۛᩳ;->᩸:Ll/ۗ᩻᩵;

    invoke-virtual {v0}, Ll/ۗ᩻᩵;->ܿ()Ljava/lang/Object;

    .line 4025
    invoke-virtual {v1, v4}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;)V

    return-void

    :cond_6
    const-wide/16 v5, 0xa

    .line 4029
    invoke-static {p0, v5, v6}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    return-void

    .line 4015
    :cond_7
    new-instance v0, Ll/۬᩻᩵;

    .line 66
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 4015
    throw v0

    .line 4013
    :cond_8
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v2, "Session preparation is no longer active"

    invoke-direct {v0, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    .line 4005
    iget-object v2, p0, Ll/ۤۛᩳ;->᩸:Ll/ۗ᩻᩵;

    if-eqz v2, :cond_9

    invoke-virtual {v2, v3}, Ll/ۗ᩻᩵;->cancel(Z)Z

    .line 4006
    :cond_9
    iput-object v4, p0, Ll/ۤۛᩳ;->᩸:Ll/ۗ᩻᩵;

    .line 4032
    invoke-virtual {v1, v0}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    return-void
.end method
