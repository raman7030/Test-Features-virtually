.class public final Ll/᩻֨ܽ;
.super Ljava/lang/Object;
.source "Z6QT"


# instance fields
.field public final ֫:C

.field public final ۧ:Z

.field public final ܽ:I

.field public final ᩳ:Ll/ۧۚܽ;


# direct methods
.method public constructor <init>(Ll/ܿ֨ܽ;)V
    .locals 1

    .line 1353
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1354
    invoke-static {p1}, Ll/ܿ֨ܽ;->ܽ(Ll/ܿ֨ܽ;)I

    move-result v0

    iput v0, p0, Ll/᩻֨ܽ;->ܽ:I

    .line 1355
    invoke-static {p1}, Ll/ܿ֨ܽ;->ۧ(Ll/ܿ֨ܽ;)Z

    move-result v0

    iput-boolean v0, p0, Ll/᩻֨ܽ;->ۧ:Z

    .line 1356
    invoke-static {p1}, Ll/ܿ֨ܽ;->֫(Ll/ܿ֨ܽ;)C

    move-result v0

    iput-char v0, p0, Ll/᩻֨ܽ;->֫:C

    .line 1357
    invoke-static {p1}, Ll/ܿ֨ܽ;->ᩳ(Ll/ܿ֨ܽ;)Ll/ۧۚܽ;

    move-result-object p1

    iput-object p1, p0, Ll/᩻֨ܽ;->ᩳ:Ll/ۧۚܽ;

    return-void
.end method
