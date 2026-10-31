.class public final Ll/ܿᩳܺ;
.super Ljava/lang/Object;
.source "5BHG"


# instance fields
.field public final ֫:Ljava/util/HashMap;

.field public final synthetic ۧ:Ll/ۡᩳܺ;


# direct methods
.method public constructor <init>(Ll/ۡᩳܺ;)V
    .locals 0

    .line 180
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿᩳܺ;->ۧ:Ll/ۡᩳܺ;

    .line 184
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/ܿᩳܺ;->֫:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/Collection;
    .locals 1

    .line 210
    iget-object v0, p0, Ll/ܿᩳܺ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/۟ܺܺ;)Ll/ܳᩳܺ;
    .locals 3

    .line 195
    iget-object v0, p0, Ll/ܿᩳܺ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳᩳܺ;

    if-nez v1, :cond_0

    .line 197
    iget-object v1, p0, Ll/ܿᩳܺ;->ۧ:Ll/ۡᩳܺ;

    invoke-static {v1}, Ll/ۡᩳܺ;->֫(Ll/ۡᩳܺ;)Ll/᩻ᩳܺ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩻ᩳܺ;->֫()I

    move-result v1

    .line 198
    new-instance v2, Ll/ܳᩳܺ;

    invoke-direct {v2, v1, p1}, Ll/ܳᩳܺ;-><init>(ILl/۟ܺܺ;)V

    .line 199
    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2

    :cond_0
    return-object v1
.end method
