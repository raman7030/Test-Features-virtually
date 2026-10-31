.class public final Ll/֨ۧۖ;
.super Ljava/lang/Object;
.source "W7Q5"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(IILjava/lang/String;)V
    .locals 0

    .line 190
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 191
    iput p1, p0, Ll/֨ۧۖ;->ۧ:I

    .line 192
    iput p2, p0, Ll/֨ۧۖ;->֫:I

    .line 193
    iput-object p3, p0, Ll/֨ۧۖ;->ܽ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    const-string v0, "Comment: \'"

    const-string v1, "\'"

    .line 0
    iget-object v2, p0, Ll/֨ۧۖ;->ܽ:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 5

    .line 203
    iget v0, p0, Ll/֨ۧۖ;->֫:I

    iget v1, p0, Ll/֨ۧۖ;->ۧ:I

    sub-int v2, v0, v1

    const/4 v3, 0x0

    if-lez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string v4, "Expected %s in the range [0, %s)"

    sub-int/2addr v0, v1

    invoke-static {v4, v3, v0, v2}, Ll/ۘܶܺ;->֫(Ljava/lang/String;IIZ)V

    return v1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 212
    iget-object v0, p0, Ll/֨ۧۖ;->ܽ:Ljava/lang/String;

    return-object v0
.end method
