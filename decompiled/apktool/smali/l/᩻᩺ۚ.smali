.class public final enum Ll/᩻᩺ۚ;
.super Ll/ۜ᩺ۚ;
.source "B7FA"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "instance"

    const/4 v1, 0x0

    .line 0
    invoke-direct {p0, v0, v1}, Ll/᩻᩺ۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 105
    invoke-direct {p0, p1, p2, v0}, Ll/ۜ᩺ۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public getLength()I
    .locals 2

    .line 108
    iget-object v0, p0, Ll/ۜ᩺ۚ;->᩹:Ll/᩷᩺ۚ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Ll/ۜ᩺ۚ;->ۗ:Ll/֡᩺ۚ;

    .line 109
    invoke-virtual {v0}, Ll/֡᩺ۚ;->getLength()I

    move-result v0

    add-int/lit8 v0, v0, 0x6

    iget-object v1, p0, Ll/ۜ᩺ۚ;->᩸:Ll/ᩴ᩺ۚ;

    .line 110
    invoke-virtual {v1}, Ll/ᩴ᩺ۚ;->getLength()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Ll/ۜ᩺ۚ;->᩶:Ll/ᩴ᩺ۚ;

    .line 111
    invoke-virtual {v1}, Ll/ᩴ᩺ۚ;->getLength()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Ll/ۜ᩺ۚ;->۬:Ll/֡᩺ۚ;

    .line 112
    invoke-virtual {v1}, Ll/֡᩺ۚ;->getLength()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Ll/ۜ᩺ۚ;->ۙ:Ll/ᩴ᩺ۚ;

    .line 113
    invoke-virtual {v1}, Ll/ᩴ᩺ۚ;->getLength()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public ֫(Ll/֡۫ۚ;)V
    .locals 1

    .line 119
    iget-object v0, p0, Ll/ۜ᩺ۚ;->᩹:Ll/᩷᩺ۚ;

    invoke-virtual {v0, p1}, Ll/᩷᩺ۚ;->֫(Ll/֡۫ۚ;)V

    .line 120
    iget-object v0, p0, Ll/ۜ᩺ۚ;->ۗ:Ll/֡᩺ۚ;

    invoke-virtual {v0, p1}, Ll/֡᩺ۚ;->֫(Ll/֡۫ۚ;)V

    .line 121
    iget-object v0, p0, Ll/ۜ᩺ۚ;->᩸:Ll/ᩴ᩺ۚ;

    invoke-virtual {v0, p1}, Ll/ᩴ᩺ۚ;->֫(Ll/֡۫ۚ;)V

    .line 122
    iget-object v0, p0, Ll/ۜ᩺ۚ;->᩶:Ll/ᩴ᩺ۚ;

    invoke-virtual {v0, p1}, Ll/ᩴ᩺ۚ;->֫(Ll/֡۫ۚ;)V

    .line 123
    iget-object v0, p0, Ll/ۜ᩺ۚ;->۬:Ll/֡᩺ۚ;

    invoke-virtual {v0, p1}, Ll/֡᩺ۚ;->֫(Ll/֡۫ۚ;)V

    .line 124
    iget-object v0, p0, Ll/ۜ᩺ۚ;->ۙ:Ll/ᩴ᩺ۚ;

    invoke-virtual {v0, p1}, Ll/ᩴ᩺ۚ;->֫(Ll/֡۫ۚ;)V

    return-void
.end method

.method public bridge synthetic ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
