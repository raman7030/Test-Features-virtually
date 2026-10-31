.class public final Ll/᩶᩷ܽ;
.super Ljava/lang/Object;
.source "T13W"


# instance fields
.field public final ֫:Ll/ۙ᩷ܽ;

.field public final ۧ:Ll/ۤ᩷ܽ;

.field public ܽ:[Ll/ۨ᩷ܽ;

.field public final ᩳ:Ll/ܺܺܽ;


# direct methods
.method public constructor <init>(Ll/ۙ᩷ܽ;Ll/ۤ᩷ܽ;)V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v0, Ll/ܺܺܽ;

    invoke-direct {v0}, Ll/ܺܺܽ;-><init>()V

    iput-object v0, p0, Ll/᩶᩷ܽ;->ᩳ:Ll/ܺܺܽ;

    .line 14
    iput-object p1, p0, Ll/᩶᩷ܽ;->֫:Ll/ۙ᩷ܽ;

    .line 15
    iput-object p2, p0, Ll/᩶᩷ܽ;->ۧ:Ll/ۤ᩷ܽ;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)I
    .locals 1

    .line 27
    iget-object v0, p0, Ll/᩶᩷ܽ;->֫:Ll/ۙ᩷ܽ;

    invoke-virtual {v0, p1}, Ll/ۙ᩷ܽ;->֫(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final ֫(I)V
    .locals 1

    .line 31
    iget-object v0, p0, Ll/᩶᩷ܽ;->֫:Ll/ۙ᩷ܽ;

    iget-object v0, v0, Ll/ۙ᩷ܽ;->ܽ:[Ll/۫᩷ܽ;

    aget-object p1, v0, p1

    const/4 v0, 0x0

    .line 42
    invoke-virtual {p1, p0, v0}, Ll/۫᩷ܽ;->֫(Ll/᩶᩷ܽ;Z)V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)I
    .locals 1

    .line 23
    iget-object v0, p0, Ll/᩶᩷ܽ;->ۧ:Ll/ۤ᩷ܽ;

    invoke-virtual {v0, p1}, Ll/ۤ᩷ܽ;->֫(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final ۧ(I)V
    .locals 1

    .line 19
    iget-object v0, p0, Ll/᩶᩷ܽ;->ۧ:Ll/ۤ᩷ܽ;

    invoke-virtual {v0, p0, p1}, Ll/ۤ᩷ܽ;->֫(Ll/᩶᩷ܽ;I)V

    return-void
.end method
