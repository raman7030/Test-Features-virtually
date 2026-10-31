.class public final Ll/᩹ۤᩴ;
.super Ll/֡ۤᩴ;
.source "N673"


# instance fields
.field public e:Ll/᩹ۤᩴ;

.field public f:Ll/᩹ۤᩴ;

.field public g:Ll/᩹ۤᩴ;

.field public h:Ll/᩹ۤᩴ;

.field public i:Z


# direct methods
.method public constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Ll/֡ۤᩴ;Ll/᩹ۤᩴ;)V
    .locals 0

    .line 2716
    invoke-direct {p0, p1, p2, p3, p4}, Ll/֡ۤᩴ;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ll/֡ۤᩴ;)V

    .line 2717
    iput-object p5, p0, Ll/᩹ۤᩴ;->e:Ll/᩹ۤᩴ;

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/Object;)Ll/֡ۤᩴ;
    .locals 1

    const/4 v0, 0x0

    .line 2721
    invoke-virtual {p0, p1, p2, v0}, Ll/᩹ۤᩴ;->b(ILjava/lang/Object;Ljava/lang/Class;)Ll/᩹ۤᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final b(ILjava/lang/Object;Ljava/lang/Class;)Ll/᩹ۤᩴ;
    .locals 5

    if-eqz p2, :cond_d

    move-object v0, p0

    .line 2733
    :cond_0
    iget-object v1, v0, Ll/᩹ۤᩴ;->f:Ll/᩹ۤᩴ;

    iget-object v2, v0, Ll/᩹ۤᩴ;->g:Ll/᩹ۤᩴ;

    .line 2734
    iget v3, v0, Ll/֡ۤᩴ;->a:I

    if-le v3, p1, :cond_1

    goto :goto_3

    :cond_1
    if-ge v3, p1, :cond_2

    goto :goto_0

    .line 2738
    :cond_2
    iget-object v3, v0, Ll/֡ۤᩴ;->b:Ljava/lang/Object;

    if-eq v3, p2, :cond_c

    if-eqz v3, :cond_3

    invoke-virtual {p2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_5

    :cond_3
    if-nez v1, :cond_4

    :goto_0
    move-object v0, v2

    goto :goto_4

    :cond_4
    if-nez v2, :cond_5

    goto :goto_3

    :cond_5
    if-nez p3, :cond_6

    .line 2745
    invoke-static {p2}, Ll/ۧۤᩴ;->c(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object p3

    if-eqz p3, :cond_a

    .line 2746
    :cond_6
    sget v0, Ll/ۧۤᩴ;->g:I

    if-eqz v3, :cond_8

    .line 738
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    if-eq v0, p3, :cond_7

    goto :goto_1

    .line 739
    :cond_7
    move-object v0, p2

    check-cast v0, Ljava/lang/Comparable;

    invoke-interface {v0, v3}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v0

    goto :goto_2

    :cond_8
    :goto_1
    const/4 v0, 0x0

    :goto_2
    if-eqz v0, :cond_a

    if-gez v0, :cond_9

    goto :goto_3

    :cond_9
    move-object v1, v2

    goto :goto_3

    .line 2748
    :cond_a
    invoke-virtual {v2, p1, p2, p3}, Ll/᩹ۤᩴ;->b(ILjava/lang/Object;Ljava/lang/Class;)Ll/᩹ۤᩴ;

    move-result-object v0

    if-eqz v0, :cond_b

    return-object v0

    :cond_b
    :goto_3
    move-object v0, v1

    :goto_4
    if-nez v0, :cond_0

    goto :goto_6

    :cond_c
    :goto_5
    return-object v0

    :cond_d
    :goto_6
    const/4 p1, 0x0

    return-object p1
.end method
