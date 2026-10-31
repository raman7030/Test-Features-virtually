.class public final Ll/ۨ᩺֫;
.super Ljava/lang/Object;
.source "97LV"


# instance fields
.field public final ֫:Ljava/util/ArrayDeque;

.field public ۧ:Ljava/lang/String;

.field public final ܽ:Ljava/io/BufferedReader;


# direct methods
.method public constructor <init>(Ljava/util/ArrayDeque;Ljava/io/BufferedReader;)V
    .locals 0

    .line 1624
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1625
    iput-object p1, p0, Ll/ۨ᩺֫;->֫:Ljava/util/ArrayDeque;

    .line 1626
    iput-object p2, p0, Ll/ۨ᩺֫;->ܽ:Ljava/io/BufferedReader;

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 3
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNullIf;
        expression = {
            "next"
        }
        result = true
    .end annotation

    .line 1631
    iget-object v0, p0, Ll/ۨ᩺֫;->ۧ:Ljava/lang/String;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1634
    :cond_0
    iget-object v0, p0, Ll/ۨ᩺֫;->֫:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    .line 1635
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1635
    iput-object v0, p0, Ll/ۨ᩺֫;->ۧ:Ljava/lang/String;

    return v1

    .line 1638
    :cond_1
    iget-object v0, p0, Ll/ۨ᩺֫;->ܽ:Ljava/io/BufferedReader;

    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۨ᩺֫;->ۧ:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 1639
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۨ᩺֫;->ۧ:Ljava/lang/String;

    .line 1640
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    return v1

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 2

    .line 1649
    invoke-virtual {p0}, Ll/ۨ᩺֫;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1650
    iget-object v0, p0, Ll/ۨ᩺֫;->ۧ:Ljava/lang/String;

    const/4 v1, 0x0

    .line 1651
    iput-object v1, p0, Ll/ۨ᩺֫;->ۧ:Ljava/lang/String;

    return-object v0

    .line 1654
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
