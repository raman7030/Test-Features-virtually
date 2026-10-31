.class public final Ll/ܶ᩶ۘ;
.super Ljava/lang/Object;
.source "G8ZP"

# interfaces
.implements Ll/֨᩶ۘ;


# instance fields
.field public final ֫:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Ll/ܶ᩶ۘ;->֫:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Class;Ll/֫ۙۘ;)Ll/֨᩶ۘ;
    .locals 1

    .line 49
    iget-object v0, p0, Ll/ܶ᩶ۘ;->֫:Ljava/util/HashMap;

    .line 52
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final ֫()Ll/۠᩶ۘ;
    .locals 2

    .line 122
    new-instance v0, Ll/᩸᩶ۘ;

    iget-object v1, p0, Ll/ܶ᩶ۘ;->֫:Ljava/util/HashMap;

    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/᩸᩶ۘ;-><init>(Ljava/util/Map;)V

    return-object v0
.end method
