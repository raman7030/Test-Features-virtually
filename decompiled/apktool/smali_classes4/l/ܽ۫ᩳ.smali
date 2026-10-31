.class public final Ll/ܽ۫ᩳ;
.super Ll/᩸᩸ᩳ;
.source "P7QH"


# instance fields
.field public final synthetic ۬:Ll/ܿ۫ᩳ;


# direct methods
.method public constructor <init>(Ll/ܿ۫ᩳ;Ll/۟᩺ᩳ;)V
    .locals 0

    .line 226
    iput-object p1, p0, Ll/ܽ۫ᩳ;->۬:Ll/ܿ۫ᩳ;

    invoke-direct {p0, p2}, Ll/᩸᩸ᩳ;-><init>(Landroid/text/Editable;)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 229
    iget-object v0, p0, Ll/ܽ۫ᩳ;->۬:Ll/ܿ۫ᩳ;

    invoke-static {v0}, Ll/ܿ۫ᩳ;->֫(Ll/ܿ۫ᩳ;)Ll/۫ۨᩳ;

    move-result-object v1

    .line 9843
    iget-boolean v1, v1, Ll/۫ۨᩳ;->ۜۧ:Z

    if-nez v1, :cond_0

    .line 230
    invoke-static {v0}, Ll/ܿ۫ᩳ;->֫(Ll/ܿ۫ᩳ;)Ll/۫ۨᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۫ۨᩳ;->֫ᩳ()V

    :cond_0
    return-void
.end method
