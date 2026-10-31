.class public final Ll/ۧۛ֡;
.super Ll/ᩳ۬֡;
.source "44QG"


# instance fields
.field public final ۗ:I

.field public final ۙ:I

.field public final ᩶:I

.field public final ᩹:Ll/۬ۛ֡;


# direct methods
.method public constructor <init>(Ll/۬ۛ֡;I)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object p1, p0, Ll/ۧۛ֡;->᩹:Ll/۬ۛ֡;

    .line 53
    invoke-virtual {p1}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object p1

    invoke-virtual {p1, p2}, Ll/ۘۨ֡;->ܺ(I)Ll/ᩴۨ֡;

    move-result-object p1

    .line 54
    invoke-virtual {p1}, Ll/ᩴۨ֡;->ۖ()I

    move-result p2

    iput p2, p0, Ll/ۧۛ֡;->ۗ:I

    .line 55
    invoke-virtual {p1}, Ll/ᩴۨ֡;->ܺ()I

    move-result p2

    iput p2, p0, Ll/ۧۛ֡;->ۙ:I

    .line 56
    invoke-virtual {p1}, Ll/ᩴۨ֡;->ۧ()I

    move-result p2

    iput p2, p0, Ll/ۧۛ֡;->᩶:I

    .line 57
    invoke-virtual {p1}, Ll/ᩴۨ֡;->ۘ()V

    return-void
.end method


# virtual methods
.method public final getElements()Ljava/util/Set;
    .locals 4

    .line 74
    iget-object v0, p0, Ll/ۧۛ֡;->᩹:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, p0, Ll/ۧۛ֡;->᩶:I

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ܺ(I)Ll/ᩴۨ֡;

    move-result-object v1

    .line 75
    invoke-virtual {v1}, Ll/ᩴۨ֡;->ܺ()I

    move-result v2

    .line 76
    invoke-virtual {v1}, Ll/ᩴۨ֡;->ۧ()I

    move-result v3

    .line 77
    invoke-virtual {v1}, Ll/ᩴۨ֡;->ۘ()V

    .line 79
    new-instance v1, Ll/֫ۛ֡;

    invoke-direct {v1, p0, v0, v3, v2}, Ll/֫ۛ֡;-><init>(Ll/ۧۛ֡;Ll/۬ۛ֡;II)V

    return-object v1
.end method

.method public final getType()Ljava/lang/String;
    .locals 2

    .line 68
    iget-object v0, p0, Ll/ۧۛ֡;->᩹:Ll/۬ۛ֡;

    iget v1, p0, Ll/ۧۛ֡;->ۙ:I

    invoke-virtual {v0, v1}, Ll/۬ۛ֡;->ۡ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getVisibility()I
    .locals 1

    .line 62
    iget v0, p0, Ll/ۧۛ֡;->ۗ:I

    return v0
.end method
