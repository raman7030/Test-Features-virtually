.class public final Ll/ܿ۬ۖ;
.super Ljava/lang/Object;
.source "A4XC"

# interfaces
.implements Ll/᩵ۙۖ;


# instance fields
.field public final synthetic ֫:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ljava/util/HashMap;)V
    .locals 0

    .line 519
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿ۬ۖ;->֫:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֫ۙۖ;)V
    .locals 6

    .line 522
    iget-object v0, p1, Ll/֫ۙۖ;->᩷:Ll/۟᩶ۖ;

    sget-object v1, Ll/۟᩶ۖ;->᩶:Ll/۟᩶ۖ;

    iget-object v2, p0, Ll/ܿ۬ۖ;->֫:Ljava/util/HashMap;

    if-ne v0, v1, :cond_2

    .line 523
    invoke-virtual {p1}, Ll/֫ۙۖ;->ܿ()Ll/۠᩶ۖ;

    move-result-object v0

    iget-object v0, v0, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v1, Ll/֨᩶ۖ;->۫֫:Ll/֨᩶ۖ;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Ll/֫ۙۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object v0

    iget-object v0, v0, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v1, Ll/֨᩶ۖ;->᩸֫:Ll/֨᩶ۖ;

    if-ne v0, v1, :cond_0

    .line 524
    invoke-virtual {p1}, Ll/֫ۙۖ;->ܿ()Ll/۠᩶ۖ;

    move-result-object v0

    check-cast v0, Ll/ܺ᩶ۖ;

    .line 78
    iget-object v1, v0, Ll/᩵᩶ۖ;->ۗ:Ll/۠᩶ۖ;

    .line 525
    iget-object v3, v1, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v4, Ll/֨᩶ۖ;->ۛ:Ll/֨᩶ۖ;

    if-ne v3, v4, :cond_3

    .line 526
    check-cast v1, Ll/ۨ᩹ۖ;

    iget-object v1, v1, Ll/ۨ᩹ۖ;->ۗ:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-ltz v1, :cond_3

    .line 536
    invoke-virtual {p1}, Ll/֫ۙۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object v3

    check-cast v3, Ll/ᩳ᩶ۖ;

    new-instance v4, Ll/᩻۬ۖ;

    iget-object v0, v0, Ll/ܺ᩶ۖ;->۬:Ljava/lang/String;

    check-cast p1, Ll/᩸᩶ۖ;

    .line 88
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 85
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, v4, Ll/᩻۬ۖ;->ۧ:Ljava/util/ArrayList;

    .line 86
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, v4, Ll/᩻۬ۖ;->ܿ:Ljava/util/ArrayList;

    .line 89
    iput v1, v4, Ll/᩻۬ۖ;->ܽ:I

    .line 90
    iput-object v0, v4, Ll/᩻۬ۖ;->ᩳ:Ljava/lang/String;

    .line 91
    iput-object p1, v4, Ll/᩻۬ۖ;->֫:Ll/᩸᩶ۖ;

    .line 536
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 539
    :cond_0
    invoke-virtual {p1}, Ll/֫ۙۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object v0

    iget-object v0, v0, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v1, Ll/֨᩶ۖ;->۬:Ll/֨᩶ۖ;

    if-ne v0, v1, :cond_3

    .line 540
    invoke-virtual {p1}, Ll/֫ۙۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object v0

    check-cast v0, Ll/۫᩹ۖ;

    .line 113
    iget-object v1, v0, Ll/֡᩶ۖ;->ۗ:Ll/۠᩶ۖ;

    .line 541
    iget-object v3, v1, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v4, Ll/֨᩶ۖ;->᩸֫:Ll/֨᩶ۖ;

    if-ne v3, v4, :cond_3

    .line 542
    check-cast v1, Ll/ᩳ᩶ۖ;

    .line 543
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩻۬ۖ;

    if-eqz v3, :cond_3

    .line 118
    iget-object v0, v0, Ll/֡᩶ۖ;->۬:Ll/۠᩶ۖ;

    .line 545
    iget-object v0, v0, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v4, Ll/֨᩶ۖ;->ۛ:Ll/֨᩶ۖ;

    if-ne v0, v4, :cond_1

    .line 546
    iget-object v0, v3, Ll/᩻۬ۖ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 548
    :cond_1
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 553
    :cond_2
    sget-object v1, Ll/۟᩶ۖ;->ۙ:Ll/۟᩶ۖ;

    if-ne v0, v1, :cond_3

    .line 554
    invoke-virtual {p1}, Ll/֫ۙۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object v0

    iget-object v0, v0, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v1, Ll/֨᩶ۖ;->᩸֫:Ll/֨᩶ۖ;

    if-ne v0, v1, :cond_3

    .line 555
    invoke-virtual {p1}, Ll/֫ۙۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object v0

    check-cast v0, Ll/ᩳ᩶ۖ;

    .line 556
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩻۬ۖ;

    if-eqz v0, :cond_3

    .line 558
    iget-object v0, v0, Ll/᩻۬ۖ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    return-void
.end method
