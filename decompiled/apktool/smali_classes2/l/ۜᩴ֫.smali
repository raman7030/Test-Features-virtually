.class public final Ll/ۜᩴ֫;
.super Ljava/lang/Object;
.source "18KP"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܳ:I

.field public ܽ:I

.field public ܿ:[B

.field public ᩳ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 52
    iput v0, p0, Ll/ۜᩴ֫;->ܽ:I

    .line 53
    iput v0, p0, Ll/ۜᩴ֫;->ۧ:I

    .line 54
    iput v0, p0, Ll/ۜᩴ֫;->ᩳ:I

    .line 55
    iput v0, p0, Ll/ۜᩴ֫;->ܳ:I

    .line 56
    iput v0, p0, Ll/ۜᩴ֫;->֫:I

    return-void
.end method

.method public constructor <init>(Ll/᩷ᩴ֫;)V
    .locals 1

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iget v0, p1, Ll/᩷ᩴ֫;->ܽ:I

    iput v0, p0, Ll/ۜᩴ֫;->ܽ:I

    .line 62
    iget v0, p1, Ll/᩷ᩴ֫;->ۧ:I

    iput v0, p0, Ll/ۜᩴ֫;->ۧ:I

    .line 63
    iget v0, p1, Ll/᩷ᩴ֫;->ᩳ:I

    iput v0, p0, Ll/ۜᩴ֫;->ᩳ:I

    .line 64
    iget-object v0, p1, Ll/᩷ᩴ֫;->ܳ:[B

    iput-object v0, p0, Ll/ۜᩴ֫;->ܿ:[B

    .line 65
    iget v0, p1, Ll/᩷ᩴ֫;->᩻:I

    iput v0, p0, Ll/ۜᩴ֫;->ܳ:I

    .line 66
    iget p1, p1, Ll/᩷ᩴ֫;->֫:I

    iput p1, p0, Ll/ۜᩴ֫;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫()Ll/᩷ᩴ֫;
    .locals 8

    .line 152
    new-instance v7, Ll/᩷ᩴ֫;

    iget v1, p0, Ll/ۜᩴ֫;->ܽ:I

    iget v2, p0, Ll/ۜᩴ֫;->ۧ:I

    iget v3, p0, Ll/ۜᩴ֫;->ᩳ:I

    iget-object v4, p0, Ll/ۜᩴ֫;->ܿ:[B

    iget v5, p0, Ll/ۜᩴ֫;->ܳ:I

    iget v6, p0, Ll/ۜᩴ֫;->֫:I

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Ll/᩷ᩴ֫;-><init>(III[BII)V

    return-object v7
.end method

.method public final ֫(I)V
    .locals 0

    .line 146
    iput p1, p0, Ll/ۜᩴ֫;->֫:I

    return-void
.end method

.method public final ֫([B)V
    .locals 0

    .line 122
    iput-object p1, p0, Ll/ۜᩴ֫;->ܿ:[B

    return-void
.end method

.method public final ۧ(I)V
    .locals 0

    .line 95
    iput p1, p0, Ll/ۜᩴ֫;->ۧ:I

    return-void
.end method

.method public final ܽ(I)V
    .locals 0

    .line 80
    iput p1, p0, Ll/ۜᩴ֫;->ܽ:I

    return-void
.end method

.method public final ܿ(I)V
    .locals 0

    .line 134
    iput p1, p0, Ll/ۜᩴ֫;->ܳ:I

    return-void
.end method

.method public final ᩳ(I)V
    .locals 0

    .line 110
    iput p1, p0, Ll/ۜᩴ֫;->ᩳ:I

    return-void
.end method
