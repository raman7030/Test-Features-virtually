.class public final Ll/ᩴۛ֡;
.super Ll/᩸۟֡;
.source "M605"


# instance fields
.field public final synthetic ۬:Ll/֨ۛ֡;


# direct methods
.method public constructor <init>(Ll/֨ۛ֡;Ll/۬ۛ֡;II)V
    .locals 0

    .line 632
    iput-object p1, p0, Ll/ᩴۛ֡;->۬:Ll/֨ۛ֡;

    invoke-direct {p0, p2, p3, p4}, Ll/᩸۟֡;-><init>(Ll/۬ۛ֡;II)V

    return-void
.end method


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 3

    .line 640
    invoke-virtual {p0}, Ll/᩸۟֡;->nextIndex()I

    move-result v0

    iget-object v1, p0, Ll/ᩴۛ֡;->۬:Ll/֨ۛ֡;

    iget-object v2, v1, Ll/֨ۛ֡;->ᩳ:Ll/۠ۛ֡;

    invoke-static {v2}, Ll/۠ۛ֡;->ܽ(Ll/۠ۛ֡;)I

    move-result v2

    if-ne v0, v2, :cond_0

    .line 641
    invoke-virtual {p0}, Ll/᩸۟֡;->֫()I

    move-result v0

    invoke-static {v1, v0}, Ll/֨ۛ֡;->ۧ(Ll/֨ۛ֡;I)V

    .line 643
    :cond_0
    invoke-super {p0}, Ll/᩸۟֡;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    return-object v0
.end method

.method public final ֫(Ll/ᩴۨ֡;I)Ljava/lang/Object;
    .locals 0

    .line 635
    invoke-virtual {p1}, Ll/ᩴۨ֡;->ܺ()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
