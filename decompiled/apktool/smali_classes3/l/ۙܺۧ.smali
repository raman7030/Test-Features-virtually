.class public final Ll/ۙܺۧ;
.super Ll/ۚܺۧ;
.source "U8JQ"


# instance fields
.field public final ֫:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 180
    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۙܺۧ;->֫:Ljava/util/List;

    return-void
.end method

.method public static ֫(Ll/ᩳ֨֫;)Ll/ۙܺۧ;
    .locals 4

    .line 184
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֨()I

    move-result v0

    .line 185
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 187
    invoke-static {p0}, Ll/᩶ܺۧ;->֫(Ll/ᩳ֨֫;)Ll/᩶ܺۧ;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 189
    :cond_0
    new-instance p0, Ll/ۙܺۧ;

    invoke-direct {p0, v1}, Ll/ۙܺۧ;-><init>(Ljava/util/ArrayList;)V

    return-object p0
.end method
