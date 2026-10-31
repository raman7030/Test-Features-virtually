.class public final Ll/᩻ۗۖ;
.super Ljava/lang/Object;
.source "I4PY"

# interfaces
.implements Ll/۠ۙۖ;


# instance fields
.field public final synthetic ֫:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ljava/util/HashMap;)V
    .locals 0

    .line 166
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻ۗۖ;->֫:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ᩳ᩶ۖ;)Ll/۠᩶ۖ;
    .locals 1

    .line 174
    iget-object v0, p0, Ll/᩻ۗۖ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۠᩶ۖ;

    if-nez v0, :cond_0

    return-object p1

    .line 175
    :cond_0
    invoke-virtual {v0}, Ll/۠᩶ۖ;->clone()Ll/۠᩶ۖ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ᩳ᩶ۖ;Ll/᩸᩶ۖ;)Ll/ᩳ᩶ۖ;
    .locals 0

    return-object p1
.end method
