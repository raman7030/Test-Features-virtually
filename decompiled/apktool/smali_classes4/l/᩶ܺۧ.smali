.class public final Ll/᩶ܺۧ;
.super Ljava/lang/Object;
.source "U8JQ"


# instance fields
.field public final ֫:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 0

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/᩶ܺۧ;->֫:Ljava/util/List;

    return-void
.end method

.method public static ֫(Ll/ᩳ֨֫;)Ll/᩶ܺۧ;
    .locals 5

    .line 110
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ܶ()J

    .line 112
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֨()I

    move-result v0

    and-int/lit16 v0, v0, 0x80

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 116
    :goto_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    if-nez v0, :cond_6

    .line 123
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֨()I

    move-result v0

    and-int/lit8 v4, v0, 0x40

    if-eqz v4, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    if-eqz v4, :cond_3

    .line 128
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ܶ()J

    :cond_3
    if-nez v4, :cond_4

    .line 131
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֨()I

    move-result v0

    .line 132
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    :goto_3
    if-ge v2, v0, :cond_4

    .line 134
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֨()I

    .line 135
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ܶ()J

    .line 136
    new-instance v4, Ll/᩹ܺۧ;

    .line 170
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 136
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_4
    if-eqz v1, :cond_5

    .line 140
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֨()I

    .line 142
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ܶ()J

    .line 145
    :cond_5
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ۗ()I

    .line 146
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֨()I

    .line 147
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֨()I

    .line 149
    :cond_6
    new-instance p0, Ll/᩶ܺۧ;

    invoke-direct {p0, v3}, Ll/᩶ܺۧ;-><init>(Ljava/util/ArrayList;)V

    return-object p0
.end method
