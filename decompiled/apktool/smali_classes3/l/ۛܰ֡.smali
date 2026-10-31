.class public final Ll/ۛܰ֡;
.super Ll/ᩴ۟֡;
.source "Z5Z9"


# instance fields
.field public final synthetic ᩶:I

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ll/۬ۛ֡;


# direct methods
.method public constructor <init>(Ll/۬ۛ֡;II)V
    .locals 0

    .line 91
    iput-object p1, p0, Ll/ۛܰ֡;->᩹:Ll/۬ۛ֡;

    iput p2, p0, Ll/ۛܰ֡;->᩸:I

    iput p3, p0, Ll/ۛܰ֡;->᩶:I

    .line 44
    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public final size()I
    .locals 1

    .line 101
    iget v0, p0, Ll/ۛܰ֡;->᩶:I

    return v0
.end method

.method public final ֫(I)Ljava/lang/Object;
    .locals 3

    .line 95
    iget-object v0, p0, Ll/ۛܰ֡;->᩹:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, p0, Ll/ۛܰ֡;->᩸:I

    add-int/lit8 v2, v2, 0x4

    mul-int/lit8 p1, p1, 0x4

    add-int/2addr p1, v2

    invoke-virtual {v1, p1}, Ll/ۘۨ֡;->ۜ(I)I

    move-result p1

    .line 96
    new-instance v1, Ll/ۧۛ֡;

    invoke-direct {v1, v0, p1}, Ll/ۧۛ֡;-><init>(Ll/۬ۛ֡;I)V

    return-object v1
.end method
