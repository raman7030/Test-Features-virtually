.class public final Ll/ܿ۫ۢ;
.super Ljava/lang/Object;
.source "H6OP"

# interfaces
.implements Ll/ۖ᩷֡;


# instance fields
.field public final ֫:Ljava/util/IdentityHashMap;

.field public final ۧ:Z

.field public final ܳ:Ljava/util/ArrayList;

.field public final ܽ:Z

.field public final ܿ:Ljava/util/IdentityHashMap;

.field public final ᩳ:Ll/ܽ۫ۢ;


# direct methods
.method public constructor <init>(ZZZ)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܿ۫ۢ;->ܳ:Ljava/util/ArrayList;

    .line 17
    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v0, p0, Ll/ܿ۫ۢ;->֫:Ljava/util/IdentityHashMap;

    .line 18
    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v0, p0, Ll/ܿ۫ۢ;->ܿ:Ljava/util/IdentityHashMap;

    .line 21
    iput-boolean p1, p0, Ll/ܿ۫ۢ;->ܽ:Z

    .line 22
    iput-boolean p2, p0, Ll/ܿ۫ۢ;->ۧ:Z

    if-eqz p3, :cond_0

    .line 23
    new-instance p1, Ll/ܽ۫ۢ;

    invoke-direct {p1}, Ll/ܽ۫ۢ;-><init>()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Ll/ܿ۫ۢ;->ᩳ:Ll/ܽ۫ۢ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۡܳ֡;)V
    .locals 4

    .line 39
    invoke-static {}, Ll/ᩴ۫ۢ;->ܽ()V

    .line 40
    iget-object v0, p0, Ll/ܿ۫ۢ;->ᩳ:Ll/ܽ۫ۢ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/ܽ۫ۢ;->ۧ(Ll/ۡܳ֡;)V

    .line 41
    :cond_0
    iget-object v0, p0, Ll/ܿ۫ۢ;->֫:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖ۫ۢ;

    if-eqz v1, :cond_1

    .line 328
    iget-object v2, p1, Ll/ۡܳ֡;->ܿ:Ll/֡ܳ֡;

    if-eqz v2, :cond_1

    .line 42
    invoke-interface {v2}, Ll/֡ܳ֡;->ܽ()I

    move-result v2

    iput v2, v1, Ll/ۖ۫ۢ;->᩷:I

    .line 115
    :cond_1
    iget-object v2, p1, Ll/᩵ܳ֡;->ۧ:Ll/ۡܳ֡;

    .line 44
    invoke-virtual {v0, v2}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖ۫ۢ;

    .line 45
    instance-of v3, p1, Ll/ܰۙۢ;

    if-eqz v3, :cond_2

    if-eqz v0, :cond_2

    const/4 v3, 0x1

    iput-boolean v3, v0, Ll/ۖ۫ۢ;->֫:Z

    .line 46
    :cond_2
    instance-of v3, p1, Ll/֫۬ۢ;

    if-eqz v3, :cond_3

    instance-of v3, v2, Ll/ۧ۬ۢ;

    if-eqz v3, :cond_3

    if-eqz v0, :cond_3

    iget v3, v0, Ll/ۖ۫ۢ;->ۧ:I

    if-gez v3, :cond_3

    .line 322
    iget-object v3, p1, Ll/ۡܳ֡;->ᩳ:Ll/֡ܳ֡;

    .line 48
    invoke-interface {v3}, Ll/֡ܳ֡;->ܽ()I

    move-result v3

    iput v3, v0, Ll/ۖ۫ۢ;->ۧ:I

    .line 51
    :cond_3
    iget-object v0, p0, Ll/ܿ۫ۢ;->ܿ:Ljava/util/IdentityHashMap;

    if-eqz v1, :cond_4

    iget-boolean v3, v1, Ll/ۖ۫ۢ;->᩻:Z

    if-eqz v3, :cond_4

    invoke-virtual {v0, v2, v1}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    :cond_4
    instance-of v1, p1, Ll/᩸ۙۢ;

    if-eqz v1, :cond_5

    .line 53
    invoke-virtual {v0, v2}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖ۫ۢ;

    if-eqz v1, :cond_5

    const/4 v2, 0x0

    .line 54
    iput-boolean v2, v1, Ll/ۖ۫ۢ;->᩻:Z

    .line 56
    :cond_5
    instance-of v1, p1, Ll/᩸ۗۢ;

    if-eqz v1, :cond_6

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    const/4 v0, 0x0

    .line 57
    iput-object v0, p1, Ll/ۡܳ֡;->ܽ:Ljava/util/ArrayList;

    return-void
.end method

.method public final ֫(Ll/ۡ᩷֡;)V
    .locals 0

    .line 69
    invoke-virtual {p0, p1}, Ll/ܿ۫ۢ;->֫(Ll/ᩴ᩷֡;)V

    return-void
.end method

.method public final ֫(Ll/ᩴ᩷֡;)V
    .locals 2

    .line 61
    iget-object v0, p1, Ll/ᩴ᩷֡;->ۧ:Ll/֡ܳ֡;

    .line 27
    iget-object p1, p1, Ll/ᩴ᩷֡;->֫:Ll/᩵ܳ֡;

    .line 61
    check-cast p1, Ll/ۡܳ֡;

    .line 62
    iget-object v1, p0, Ll/ܿ۫ۢ;->֫:Ljava/util/IdentityHashMap;

    invoke-virtual {v1, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖ۫ۢ;

    if-eqz v1, :cond_0

    .line 63
    invoke-virtual {v1, v0}, Ll/ۖ۫ۢ;->֫(Ll/֡ܳ֡;)V

    .line 64
    :cond_0
    iget-object v1, p0, Ll/ܿ۫ۢ;->ᩳ:Ll/ܽ۫ۢ;

    if-eqz v1, :cond_1

    invoke-virtual {v1, p1, v0}, Ll/ܽ۫ۢ;->֫(Ll/ۡܳ֡;Ll/֡ܳ֡;)V

    .line 66
    :cond_1
    iget-object p1, p1, Ll/ۡܳ֡;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final ۧ(Ll/ۡܳ֡;)V
    .locals 3

    .line 27
    invoke-static {}, Ll/ᩴ۫ۢ;->ܽ()V

    .line 28
    iget-object v0, p0, Ll/ܿ۫ۢ;->ᩳ:Ll/ܽ۫ۢ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/ܽ۫ۢ;->֫(Ll/ۡܳ֡;)V

    .line 29
    :cond_0
    iget-boolean v0, p0, Ll/ܿ۫ۢ;->ۧ:Z

    if-nez v0, :cond_1

    goto/16 :goto_1

    .line 30
    :cond_1
    iget-boolean v0, p0, Ll/ܿ۫ۢ;->ܽ:Z

    const/4 v1, -0x1

    if-eqz v0, :cond_3

    .line 63
    instance-of v0, p1, Ll/ܰ۬ۢ;

    if-eqz v0, :cond_2

    const/4 v0, -0x2

    goto :goto_0

    .line 64
    :cond_2
    instance-of v0, p1, Ll/ۛ۬ۢ;

    if-eqz v0, :cond_4

    const/4 v0, -0x3

    goto :goto_0

    .line 66
    :cond_3
    invoke-virtual {p1}, Ll/᩵ܳ֡;->ۧ()I

    move-result v0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_5

    const/4 v2, 0x2

    if-eq v0, v2, :cond_5

    const/16 v2, 0x8

    if-eq v0, v2, :cond_5

    const/16 v2, 0x9

    if-eq v0, v2, :cond_5

    const/16 v2, 0xe

    if-eq v0, v2, :cond_5

    const/16 v2, 0xf

    if-eq v0, v2, :cond_5

    const/16 v2, 0x11

    if-eq v0, v2, :cond_5

    const/16 v2, 0x12

    if-eq v0, v2, :cond_5

    const/16 v2, 0x28

    if-eq v0, v2, :cond_5

    const/16 v2, 0x29

    if-eq v0, v2, :cond_5

    const/16 v2, 0x32

    if-eq v0, v2, :cond_5

    const/16 v2, 0x33

    if-eq v0, v2, :cond_5

    const/16 v2, 0x36

    if-eq v0, v2, :cond_5

    const/16 v2, 0x37

    if-eq v0, v2, :cond_5

    const/16 v2, 0x1e

    if-eq v0, v2, :cond_5

    const/16 v2, 0x22

    if-eq v0, v2, :cond_5

    const/16 v2, 0x2b

    if-eq v0, v2, :cond_5

    const/16 v2, 0x2f

    if-eq v0, v2, :cond_5

    const/16 v2, 0x48

    if-eq v0, v2, :cond_5

    packed-switch v0, :pswitch_data_0

    packed-switch v0, :pswitch_data_1

    packed-switch v0, :pswitch_data_2

    :cond_4
    const/4 v0, -0x1

    :cond_5
    :goto_0
    :pswitch_0
    if-ne v0, v1, :cond_6

    :goto_1
    return-void

    .line 32
    :cond_6
    new-instance v1, Ll/ۖ۫ۢ;

    invoke-direct {v1, v0, p1}, Ll/ۖ۫ۢ;-><init>(ILl/ۡܳ֡;)V

    .line 34
    iget-object v0, p0, Ll/ܿ۫ۢ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    iget-object v0, p0, Ll/ܿ۫ۢ;->֫:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1, v1}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x39
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x3f
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
