.class public final Ll/ۙܺܿ;
.super Ljava/lang/Object;
.source "86ZM"


# instance fields
.field public final ֫:Ll/ܶܺܿ;

.field public final ۧ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;Ll/ܶܺܿ;)V
    .locals 0

    .line 816
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 817
    iput-object p1, p0, Ll/ۙܺܿ;->ۧ:Ljava/util/List;

    .line 818
    iput-object p2, p0, Ll/ۙܺܿ;->֫:Ll/ܶܺܿ;

    return-void
.end method

.method public static ֫(Ljava/util/List;)Ll/ۙܺܿ;
    .locals 2

    .line 822
    new-instance v0, Ll/ۙܺܿ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll/ۙܺܿ;-><init>(Ljava/util/List;Ll/ܶܺܿ;)V

    return-object v0
.end method
