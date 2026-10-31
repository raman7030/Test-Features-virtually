.class public final Ll/ۤܽ۠;
.super Ll/۟ܽ۠;
.source "A7MK"


# instance fields
.field public final synthetic ᩳ:Ll/ᩴܶ۠;


# direct methods
.method public constructor <init>(Ll/֫ᩳ۠;Ll/ᩴܶ۠;)V
    .locals 0

    .line 611
    iput-object p2, p0, Ll/ۤܽ۠;->ᩳ:Ll/ᩴܶ۠;

    .line 852
    invoke-direct {p0, p1}, Ll/᩺ܽ۠;-><init>(Ll/֫ᩳ۠;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܿ֡֨;Ll/ۢۚ۠;)Z
    .locals 2

    .line 627
    iget-object v0, p0, Ll/᩺ܽ۠;->֫:Ljava/util/LinkedHashMap;

    iget-object v1, p2, Ll/ۢۚ۠;->᩺:Ll/۫֡֨;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 628
    iget-object p1, p0, Ll/ۤܽ۠;->ᩳ:Ll/ᩴܶ۠;

    invoke-virtual {p1, p2}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method
