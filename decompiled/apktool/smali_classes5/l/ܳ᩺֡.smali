.class public final Ll/ܳ᩺֡;
.super Ll/ᩳ᩺֡;
.source "F64Z"


# instance fields
.field public final synthetic ᩶:I

.field public final synthetic ᩹:Ll/ۜ᩺֡;


# direct methods
.method public constructor <init>(Ll/ۜ᩺֡;I)V
    .locals 0

    .line 105
    iput-object p1, p0, Ll/ܳ᩺֡;->᩹:Ll/ۜ᩺֡;

    iput p2, p0, Ll/ܳ᩺֡;->᩶:I

    invoke-direct {p0, p1}, Ll/ᩳ᩺֡;-><init>(Ll/ۜ᩺֡;)V

    return-void
.end method


# virtual methods
.method public final ֫(I)Ljava/lang/Object;
    .locals 2

    .line 109
    iget-object v0, p0, Ll/ܳ᩺֡;->᩹:Ll/ۜ᩺֡;

    iget-object v0, v0, Ll/ۢܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    mul-int/lit8 p1, p1, 0x4

    iget v1, p0, Ll/ܳ᩺֡;->᩶:I

    add-int/2addr p1, v1

    invoke-virtual {v0, p1}, Ll/ۘۨ֡;->ۧ(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
