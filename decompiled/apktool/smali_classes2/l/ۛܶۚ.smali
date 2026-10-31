.class public final Ll/ۛܶۚ;
.super Ljava/lang/Object;
.source "A18X"


# instance fields
.field public final ֫:Ll/᩷᩹ۚ;

.field public ۧ:Ll/᩶֡ۚ;

.field public ܽ:Ll/᩶֡ۚ;


# direct methods
.method public constructor <init>(Ll/᩷᩹ۚ;)V
    .locals 1

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 69
    iput-object v0, p0, Ll/ۛܶۚ;->ۧ:Ll/᩶֡ۚ;

    .line 70
    iput-object v0, p0, Ll/ۛܶۚ;->ܽ:Ll/᩶֡ۚ;

    .line 74
    iput-object p1, p0, Ll/ۛܶۚ;->֫:Ll/᩷᩹ۚ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩶֡ۚ;Ll/᩶֡ۚ;)Ll/᩶֡ۚ;
    .locals 6

    .line 78
    iput-object p1, p0, Ll/ۛܶۚ;->ۧ:Ll/᩶֡ۚ;

    const/4 p1, 0x0

    .line 79
    iput-object p1, p0, Ll/ۛܶۚ;->ܽ:Ll/᩶֡ۚ;

    const/4 p1, 0x0

    const/4 v0, 0x0

    move-object v1, p2

    :goto_0
    if-eqz v1, :cond_e

    .line 86
    instance-of v2, v1, Ll/᩶֡ۚ;

    if-eqz v2, :cond_0

    .line 87
    move-object v2, v1

    check-cast v2, Ll/᩶֡ۚ;

    .line 88
    iget-object v3, p0, Ll/ۛܶۚ;->֫:Ll/᩷᩹ۚ;

    iget-object v4, p0, Ll/ۛܶۚ;->ۧ:Ll/᩶֡ۚ;

    invoke-virtual {v3, v4, v2}, Ll/᩷᩹ۚ;->֫(Ll/᩶֡ۚ;Ll/᩶֡ۚ;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 89
    iput-object v2, p0, Ll/ۛܶۚ;->ܽ:Ll/᩶֡ۚ;

    .line 90
    sget-object v2, Ll/ۢ᩹ۚ;->۬:Ll/ۢ᩹ۚ;

    goto :goto_1

    .line 93
    :cond_0
    sget-object v2, Ll/ۢ᩹ۚ;->᩹:Ll/ۢ᩹ۚ;

    .line 88
    :goto_1
    sget-object v3, Ll/ۢ᩹ۚ;->۬:Ll/ۢ᩹ۚ;

    if-ne v2, v3, :cond_1

    goto/16 :goto_4

    .line 91
    :cond_1
    sget-object v3, Ll/ۢ᩹ۚ;->᩹:Ll/ۢ᩹ۚ;

    if-ne v2, v3, :cond_2

    invoke-virtual {v1}, Ll/ۨ֡ۚ;->ᩳ()I

    move-result v3

    if-lez v3, :cond_2

    .line 92
    invoke-virtual {v1, p1}, Ll/ۨ֡ۚ;->֫(I)Ll/ۨ֡ۚ;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 99
    :cond_2
    :goto_2
    invoke-virtual {v1}, Ll/ۨ֡ۚ;->ۡ()Ll/ۨ֡ۚ;

    move-result-object v3

    if-nez v3, :cond_8

    if-gtz v0, :cond_3

    goto :goto_3

    .line 101
    :cond_3
    sget-object v3, Ll/ۢ᩹ۚ;->᩹:Ll/ۢ᩹ۚ;

    if-eq v2, v3, :cond_4

    sget-object v4, Ll/ۢ᩹ۚ;->ۙ:Ll/ۢ᩹ۚ;

    if-ne v2, v4, :cond_6

    .line 103
    :cond_4
    sget-object v2, Ll/ۢ᩹ۚ;->۬:Ll/ۢ᩹ۚ;

    if-ne v3, v2, :cond_5

    goto :goto_4

    :cond_5
    move-object v2, v3

    .line 107
    :cond_6
    invoke-virtual {v1}, Ll/ۨ֡ۚ;->֡()Ll/ۨ֡ۚ;

    move-result-object v4

    add-int/lit8 v0, v0, -0x1

    .line 109
    sget-object v5, Ll/ۢ᩹ۚ;->᩶:Ll/ۢ᩹ۚ;

    if-ne v2, v5, :cond_7

    .line 110
    invoke-virtual {v1}, Ll/ۨ֡ۚ;->ۚ()V

    :cond_7
    move-object v2, v3

    move-object v1, v4

    goto :goto_2

    .line 114
    :cond_8
    :goto_3
    sget-object v3, Ll/ۢ᩹ۚ;->᩹:Ll/ۢ᩹ۚ;

    if-eq v2, v3, :cond_9

    sget-object v4, Ll/ۢ᩹ۚ;->ۙ:Ll/ۢ᩹ۚ;

    if-ne v2, v4, :cond_b

    .line 116
    :cond_9
    sget-object v2, Ll/ۢ᩹ۚ;->۬:Ll/ۢ᩹ۚ;

    if-ne v3, v2, :cond_a

    goto :goto_4

    :cond_a
    move-object v2, v3

    :cond_b
    if-ne v1, p2, :cond_c

    goto :goto_4

    .line 122
    :cond_c
    invoke-virtual {v1}, Ll/ۨ֡ۚ;->ۡ()Ll/ۨ֡ۚ;

    move-result-object v3

    .line 123
    sget-object v4, Ll/ۢ᩹ۚ;->᩶:Ll/ۢ᩹ۚ;

    if-ne v2, v4, :cond_d

    .line 124
    invoke-virtual {v1}, Ll/ۨ֡ۚ;->ۚ()V

    :cond_d
    move-object v1, v3

    goto :goto_0

    .line 127
    :cond_e
    sget-object p1, Ll/ۢ᩹ۚ;->᩹:Ll/ۢ᩹ۚ;

    .line 81
    :goto_4
    iget-object p1, p0, Ll/ۛܶۚ;->ܽ:Ll/᩶֡ۚ;

    return-object p1
.end method
