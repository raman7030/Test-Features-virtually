.class public final Ll/۫᩻ᩳ;
.super Ll/۬ۗܿ;
.source "K5R1"


# instance fields
.field public final synthetic ۟:Ll/ۜۜᩳ;


# direct methods
.method public constructor <init>(Ll/ۜۜᩳ;Ll/ۜۜᩳ;)V
    .locals 0

    .line 685
    iput-object p1, p0, Ll/۫᩻ᩳ;->۟:Ll/ۜۜᩳ;

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 10

    .line 689
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۜۜᩳ;->ܽ(Ljava/lang/String;)V

    .line 690
    invoke-static {}, Ll/ۜۜᩳ;->ۨ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 691
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_b

    const-string v1, "@"

    .line 692
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "?"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "0x"

    .line 694
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    .line 695
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 693
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 696
    :cond_2
    :goto_1
    invoke-static {v0}, Ll/ۢ᩺ۡ;->֫(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    const v0, 0x7f120b48

    .line 697
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void

    .line 699
    :cond_3
    invoke-static {v0}, Ll/ۢ᩺ۡ;->ۜ(Ljava/lang/String;)I

    move-result v0

    ushr-int/lit8 v1, v0, 0x18

    and-int/lit16 v1, v1, 0xff

    ushr-int/lit8 v2, v0, 0x10

    and-int/lit16 v2, v2, 0xff

    const v3, 0xffff

    and-int/2addr v0, v3

    .line 703
    iget-object v3, p0, Ll/۫᩻ᩳ;->۟:Ll/ۜۜᩳ;

    iget-object v4, v3, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object v4, v4, Ll/᩻ۜᩳ;->۬:Ll/ۡܿܽ;

    invoke-virtual {v4}, Ll/ۡᩳܽ;->᩺()Ljava/lang/Iterable;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۘ᩻ܽ;

    .line 704
    invoke-interface {v5}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v6

    if-eq v6, v1, :cond_5

    goto :goto_2

    .line 706
    :cond_5
    invoke-interface {v5}, Ll/ۘ᩻ܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object v5

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_6
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/֡᩻ܽ;

    .line 707
    invoke-interface {v6}, Ll/֡᩻ܽ;->ۘ֫()I

    move-result v7

    if-eq v7, v2, :cond_7

    goto :goto_3

    .line 709
    :cond_7
    invoke-interface {v6}, Ll/֡᩻ܽ;->ۢ()Ljava/lang/Iterable;

    move-result-object v6

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۜ᩻ܽ;

    .line 710
    invoke-interface {v7}, Ll/ۜ᩻ܽ;->ᩳ()Ljava/lang/Iterable;

    move-result-object v7

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_9
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩷᩻ܽ;

    .line 711
    invoke-interface {v8}, Ll/᩷᩻ܽ;->ۚۧ()I

    move-result v9

    if-ne v9, v0, :cond_9

    .line 712
    iget-object v9, v3, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object v9, v9, Ll/᩻ۜᩳ;->ۡ֫:Ljava/util/ArrayList;

    check-cast v8, Ll/ᩴܿܽ;

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 717
    :cond_a
    invoke-static {}, Ll/ۜۜᩳ;->ۨ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    .line 718
    sget-object v0, Ll/ۙۜᩳ;->۬:Ll/ۙۜᩳ;

    invoke-static {v3, v0}, Ll/ۜۜᩳ;->֫(Ll/ۜۜᩳ;Ll/ۙۜᩳ;)V

    .line 719
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    :cond_b
    return-void
.end method
