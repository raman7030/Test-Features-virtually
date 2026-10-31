.class public final enum Ll/᩶ܳۘ;
.super Ljava/lang/Enum;
.source "J1L9"


# static fields
.field public static final enum ۗ:Ll/᩶ܳۘ;

.field public static final enum ۙ:Ll/᩶ܳۘ;

.field public static final synthetic ᩶:Z

.field public static final synthetic ᩹:[Ll/᩶ܳۘ;


# instance fields
.field public final ᩸:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 28
    new-instance v0, Ll/᩶ܳۘ;

    const-string v1, "LEFT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Ll/᩶ܳۘ;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/᩶ܳۘ;->ۙ:Ll/᩶ܳۘ;

    .line 29
    new-instance v0, Ll/᩶ܳۘ;

    const-string v1, "RIGHT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Ll/᩶ܳۘ;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/᩶ܳۘ;->ۗ:Ll/᩶ܳۘ;

    .line 27
    invoke-static {}, Ll/᩶ܳۘ;->ܿ()[Ll/᩶ܳۘ;

    move-result-object v0

    sput-object v0, Ll/᩶ܳۘ;->᩹:[Ll/᩶ܳۘ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 34
    iput p3, p0, Ll/᩶ܳۘ;->᩸:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/᩶ܳۘ;
    .locals 1

    .line 27
    const-class v0, Ll/᩶ܳۘ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/᩶ܳۘ;

    return-object p0
.end method

.method public static values()[Ll/᩶ܳۘ;
    .locals 1

    .line 27
    sget-object v0, Ll/᩶ܳۘ;->᩹:[Ll/᩶ܳۘ;

    invoke-virtual {v0}, [Ll/᩶ܳۘ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩶ܳۘ;

    return-object v0
.end method

.method public static ֫(I)Ll/᩶ܳۘ;
    .locals 2

    if-nez p0, :cond_0

    .line 39
    sget-object p0, Ll/᩶ܳۘ;->ۙ:Ll/᩶ܳۘ;

    return-object p0

    :cond_0
    const/4 v0, 0x1

    if-ne p0, v0, :cond_1

    .line 40
    sget-object p0, Ll/᩶ܳۘ;->ۗ:Ll/᩶ܳۘ;

    return-object p0

    .line 41
    :cond_1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "index: "

    .line 0
    invoke-static {p0, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 41
    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ljava/util/List;Ljava/lang/Object;)Ll/᩶ܳۘ;
    .locals 0

    .line 57
    invoke-interface {p0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p0

    const/4 p1, -0x1

    if-eq p0, p1, :cond_0

    .line 58
    invoke-static {p0}, Ll/᩶ܳۘ;->֫(I)Ll/᩶ܳۘ;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۧ(Z)Ll/᩶ܳۘ;
    .locals 0

    if-eqz p0, :cond_0

    .line 46
    sget-object p0, Ll/᩶ܳۘ;->ۙ:Ll/᩶ܳۘ;

    return-object p0

    :cond_0
    sget-object p0, Ll/᩶ܳۘ;->ۗ:Ll/᩶ܳۘ;

    return-object p0
.end method

.method public static ܽ(Z)Ll/᩶ܳۘ;
    .locals 0

    if-eqz p0, :cond_0

    .line 51
    sget-object p0, Ll/᩶ܳۘ;->ۗ:Ll/᩶ܳۘ;

    return-object p0

    :cond_0
    sget-object p0, Ll/᩶ܳۘ;->ۙ:Ll/᩶ܳۘ;

    return-object p0
.end method

.method public static synthetic ܿ()[Ll/᩶ܳۘ;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ll/᩶ܳۘ;

    .line 27
    sget-object v1, Ll/᩶ܳۘ;->ۙ:Ll/᩶ܳۘ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/᩶ܳۘ;->ۗ:Ll/᩶ܳۘ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public getIndex()I
    .locals 1

    .line 62
    iget v0, p0, Ll/᩶ܳۘ;->᩸:I

    return v0
.end method

.method public ֫(Ll/֡ܳۘ;)I
    .locals 1

    .line 155
    invoke-virtual {p0}, Ll/᩶ܳۘ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ll/֡ܳۘ;->ۜ()I

    move-result p1

    return p1

    :cond_0
    invoke-interface {p1}, Ll/֡ܳۘ;->᩷()I

    move-result p1

    return p1
.end method

.method public ֫(Ll/ᩴܳۘ;)I
    .locals 1

    .line 147
    invoke-virtual {p0}, Ll/᩶ܳۘ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ll/ᩴܳۘ;->֫()I

    move-result p1

    return p1

    :cond_0
    invoke-interface {p1}, Ll/ᩴܳۘ;->᩻()I

    move-result p1

    return p1
.end method

.method public ֫([I)I
    .locals 1

    .line 104
    iget v0, p0, Ll/᩶ܳۘ;->᩸:I

    aget p1, p1, v0

    return p1
.end method

.method public ֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 89
    invoke-virtual {p0}, Ll/᩶ܳۘ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    return-object p2
.end method

.method public ֫(Ljava/util/List;)Ljava/lang/Object;
    .locals 1

    .line 120
    iget v0, p0, Ll/᩶ܳۘ;->᩸:I

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Ll/ۗܳۘ;)Ljava/lang/Object;
    .locals 1

    .line 130
    invoke-virtual {p0}, Ll/᩶ܳۘ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Ll/۬ܳۘ;->֫:Ljava/lang/Object;

    return-object p1

    :cond_0
    iget-object p1, p1, Ll/۬ܳۘ;->ۧ:Ljava/lang/Object;

    return-object p1
.end method

.method public ֫([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 109
    iget v0, p0, Ll/᩶ܳۘ;->᩸:I

    aget-object p1, p1, v0

    return-object p1
.end method

.method public ֫(Z)Ll/᩶ܳۘ;
    .locals 0

    if-eqz p1, :cond_0

    .line 80
    invoke-virtual {p0}, Ll/᩶ܳۘ;->ۧ()Ll/᩶ܳۘ;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p0
.end method

.method public ֫()Z
    .locals 1

    .line 66
    iget v0, p0, Ll/᩶ܳۘ;->᩸:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ֫([Z)Z
    .locals 1

    .line 99
    iget v0, p0, Ll/᩶ܳۘ;->᩸:I

    aget-boolean p1, p1, v0

    return p1
.end method

.method public ۧ(II)I
    .locals 1

    .line 84
    invoke-virtual {p0}, Ll/᩶ܳۘ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    return p1

    :cond_0
    return p2
.end method

.method public ۧ(Ll/֡ܳۘ;)I
    .locals 1

    .line 151
    invoke-virtual {p0}, Ll/᩶ܳۘ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ll/֡ܳۘ;->ۧ()I

    move-result p1

    return p1

    :cond_0
    invoke-interface {p1}, Ll/֡ܳۘ;->ܽ()I

    move-result p1

    return p1
.end method

.method public ۧ(Ll/ᩴܳۘ;)I
    .locals 1

    .line 143
    invoke-virtual {p0}, Ll/᩶ܳۘ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ll/ᩴܳۘ;->ᩳ()I

    move-result p1

    return p1

    :cond_0
    invoke-interface {p1}, Ll/ᩴܳۘ;->ܿ()I

    move-result p1

    return p1
.end method

.method public ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 94
    invoke-virtual {p0}, Ll/᩶ܳۘ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    return-object p2
.end method

.method public ۧ(Ljava/util/List;)Ljava/lang/Object;
    .locals 1

    .line 126
    iget v0, p0, Ll/᩶ܳۘ;->᩸:I

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۧ(Ll/ۗܳۘ;)Ljava/lang/Object;
    .locals 1

    .line 135
    invoke-virtual {p0}, Ll/᩶ܳۘ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Ll/۬ܳۘ;->֫:Ljava/lang/Object;

    return-object p1

    :cond_0
    iget-object p1, p1, Ll/۬ܳۘ;->ۧ:Ljava/lang/Object;

    return-object p1
.end method

.method public ۧ([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 115
    iget v0, p0, Ll/᩶ܳۘ;->᩸:I

    aget-object p1, p1, v0

    return-object p1
.end method

.method public ۧ()Ll/᩶ܳۘ;
    .locals 1

    .line 71
    invoke-virtual {p0}, Ll/᩶ܳۘ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ll/᩶ܳۘ;->ۗ:Ll/᩶ܳۘ;

    return-object v0

    :cond_0
    sget-object v0, Ll/᩶ܳۘ;->ۙ:Ll/᩶ܳۘ;

    return-object v0
.end method
