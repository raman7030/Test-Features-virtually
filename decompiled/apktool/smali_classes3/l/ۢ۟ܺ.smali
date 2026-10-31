.class public final Ll/ۢ۟ܺ;
.super Ljava/lang/Object;
.source "57R8"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:I

.field public final ᩳ:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 94
    invoke-direct {p0, v0, v0, v0, v0}, Ll/ۢ۟ܺ;-><init>(IIIZ)V

    return-void
.end method

.method public constructor <init>(IIIZ)V
    .locals 0

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    iput p1, p0, Ll/ۢ۟ܺ;->ܽ:I

    .line 88
    iput p2, p0, Ll/ۢ۟ܺ;->ۧ:I

    .line 89
    iput p3, p0, Ll/ۢ۟ܺ;->֫:I

    .line 90
    iput-boolean p4, p0, Ll/ۢ۟ܺ;->ᩳ:Z

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 107
    invoke-static {p0}, Ll/ܺܶܺ;->֫(Ljava/lang/Object;)Ll/ۡܶܺ;

    move-result-object v0

    const-string v1, "lastIndent"

    iget v2, p0, Ll/ۢ۟ܺ;->ܽ:I

    .line 108
    invoke-virtual {v0, v1, v2}, Ll/ۡܶܺ;->֫(Ljava/lang/String;I)V

    const-string v1, "indent"

    iget v2, p0, Ll/ۢ۟ܺ;->ۧ:I

    .line 109
    invoke-virtual {v0, v1, v2}, Ll/ۡܶܺ;->֫(Ljava/lang/String;I)V

    const-string v1, "column"

    iget v2, p0, Ll/ۢ۟ܺ;->֫:I

    .line 110
    invoke-virtual {v0, v1, v2}, Ll/ۡܶܺ;->֫(Ljava/lang/String;I)V

    const-string v1, "mustBreak"

    iget-boolean v2, p0, Ll/ۢ۟ܺ;->ᩳ:Z

    .line 111
    invoke-virtual {v0, v1, v2}, Ll/ۡܶܺ;->֫(Ljava/lang/String;Z)V

    .line 112
    invoke-virtual {v0}, Ll/ۡܶܺ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)Ll/ۢ۟ܺ;
    .locals 4

    .line 98
    new-instance v0, Ll/ۢ۟ܺ;

    iget v1, p0, Ll/ۢ۟ܺ;->ۧ:I

    iget-boolean v2, p0, Ll/ۢ۟ܺ;->ᩳ:Z

    iget v3, p0, Ll/ۢ۟ܺ;->ܽ:I

    invoke-direct {v0, v3, v1, p1, v2}, Ll/ۢ۟ܺ;-><init>(IIIZ)V

    return-object v0
.end method
