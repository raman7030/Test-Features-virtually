.class public final Ll/ۨ᩹᩷;
.super Ljava/lang/Object;
.source "792D"


# instance fields
.field public ֫:I

.field public ۧ:Ll/᩹ۖܳ;

.field public ܽ:Ll/ۛ᩹᩷;


# direct methods
.method public constructor <init>(Ll/ۨ᩹᩷;)V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iget v0, p1, Ll/ۨ᩹᩷;->֫:I

    iput v0, p0, Ll/ۨ᩹᩷;->֫:I

    .line 43
    iget-object v0, p1, Ll/ۨ᩹᩷;->ۧ:Ll/᩹ۖܳ;

    iput-object v0, p0, Ll/ۨ᩹᩷;->ۧ:Ll/᩹ۖܳ;

    .line 44
    iget-object p1, p1, Ll/ۨ᩹᩷;->ܽ:Ll/ۛ᩹᩷;

    iput-object p1, p0, Ll/ۨ᩹᩷;->ܽ:Ll/ۛ᩹᩷;

    return-void
.end method

.method public constructor <init>(Ll/᩶ۖܳ;)V
    .locals 2

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iget-object v0, p1, Ll/᩶ۖܳ;->֫:Ll/᩸ۖܳ;

    .line 32
    invoke-virtual {v0}, Ll/᩸ۖܳ;->ܽ()I

    move-result v1

    iput v1, p0, Ll/ۨ᩹᩷;->֫:I

    .line 33
    invoke-static {v0}, Ll/ۛ᩹᩷;->֫(Ll/᩸ۖܳ;)Ll/ۛ᩹᩷;

    move-result-object v0

    iput-object v0, p0, Ll/ۨ᩹᩷;->ܽ:Ll/ۛ᩹᩷;

    .line 15
    iget-object p1, p1, Ll/᩶ۖܳ;->ܳ:Ll/᩹ۖܳ;

    iput-object p1, p0, Ll/ۨ᩹᩷;->ۧ:Ll/᩹ۖܳ;

    return-void
.end method

.method public constructor <init>(Ll/᩶ۖܳ;I)V
    .locals 1

    sget-object p2, Ll/᩶ۖܳ;->֫ۧ:Ll/᩸ۖܳ;

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    invoke-virtual {p2}, Ll/᩸ۖܳ;->ܽ()I

    move-result v0

    iput v0, p0, Ll/ۨ᩹᩷;->֫:I

    .line 33
    invoke-static {p2}, Ll/ۛ᩹᩷;->֫(Ll/᩸ۖܳ;)Ll/ۛ᩹᩷;

    move-result-object p2

    iput-object p2, p0, Ll/ۨ᩹᩷;->ܽ:Ll/ۛ᩹᩷;

    .line 20
    iget-object p1, p1, Ll/᩶ۖܳ;->ܳ:Ll/᩹ۖܳ;

    iput-object p1, p0, Ll/ۨ᩹᩷;->ۧ:Ll/᩹ۖܳ;

    return-void
.end method
