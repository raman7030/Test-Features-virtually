.class public final Ll/ܶۧܺ;
.super Ll/᩻ܽܺ;
.source "OBG8"


# instance fields
.field public final ۧ:I

.field public final ܽ:Ll/ܰۡܺ;


# direct methods
.method public constructor <init>(ILl/ܰۡܺ;)V
    .locals 1

    const-string v0, "AnnotationDefault"

    .line 49
    invoke-direct {p0, v0}, Ll/᩻ܽܺ;-><init>(Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 55
    iput-object p2, p0, Ll/ܶۧܺ;->ܽ:Ll/ܰۡܺ;

    .line 56
    iput p1, p0, Ll/ܶۧܺ;->ۧ:I

    return-void

    .line 52
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 65
    iget v0, p0, Ll/ܶۧܺ;->ۧ:I

    add-int/lit8 v0, v0, 0x6

    return v0
.end method

.method public final ۧ()Ll/ܰۡܺ;
    .locals 1

    .line 74
    iget-object v0, p0, Ll/ܶۧܺ;->ܽ:Ll/ܰۡܺ;

    return-object v0
.end method
