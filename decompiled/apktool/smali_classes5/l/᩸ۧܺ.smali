.class public final Ll/᩸ۧܺ;
.super Ll/᩻ܽܺ;
.source "WBAF"


# instance fields
.field public final ۧ:Ll/᩵ܽܺ;

.field public final ܽ:I


# direct methods
.method public constructor <init>(Ll/᩵ܽܺ;)V
    .locals 3

    const-string v0, "BootstrapMethods"

    .line 38
    invoke-direct {p0, v0}, Ll/᩻ܽܺ;-><init>(Ljava/lang/String;)V

    .line 39
    iput-object p1, p0, Ll/᩸ۧܺ;->ۧ:Ll/᩵ܽܺ;

    .line 41
    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x4

    add-int/lit8 v0, v0, 0x8

    const/4 v1, 0x0

    .line 42
    :goto_0
    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 43
    invoke-virtual {p1, v1}, Ll/ܿᩴܺ;->get(I)Ll/ᩴܽܺ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ᩴܽܺ;->֫()Ll/ۘܽܺ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܿᩴܺ;->size()I

    move-result v2

    mul-int/lit8 v2, v2, 0x2

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 46
    :cond_0
    iput v0, p0, Ll/᩸ۧܺ;->ܽ:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 51
    iget v0, p0, Ll/᩸ۧܺ;->ܽ:I

    return v0
.end method

.method public final ۧ()Ll/᩵ܽܺ;
    .locals 1

    .line 60
    iget-object v0, p0, Ll/᩸ۧܺ;->ۧ:Ll/᩵ܽܺ;

    return-object v0
.end method
