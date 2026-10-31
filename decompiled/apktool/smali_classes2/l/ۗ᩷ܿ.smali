.class public final Ll/ۗ᩷ܿ;
.super Ljava/lang/Object;
.source "I97D"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final ۗ:Ll/ۧۤᩴ;


# instance fields
.field public final ۙ:Ljava/lang/String;

.field public final ᩶:I

.field public final ᩸:Ll/ۡۜܿ;

.field public final ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 12
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    sput-object v0, Ll/ۗ᩷ܿ;->ۗ:Ll/ۧۤᩴ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Ll/ۗ᩷ܿ;->ۙ:Ljava/lang/String;

    .line 37
    iput p2, p0, Ll/ۗ᩷ܿ;->᩹:I

    const-string p2, "parseColor("

    .line 38
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 39
    invoke-static {p1}, Ll/ۡۜܿ;->֫(Ljava/lang/String;)Ll/ۡۜܿ;

    move-result-object p1

    iput-object p1, p0, Ll/ۗ᩷ܿ;->᩸:Ll/ۡۜܿ;

    const/4 p1, 0x0

    .line 40
    iput p1, p0, Ll/ۗ᩷ܿ;->᩶:I

    return-void

    :cond_0
    const/4 p2, 0x0

    .line 42
    iput-object p2, p0, Ll/ۗ᩷ܿ;->᩸:Ll/ۡۜܿ;

    .line 43
    invoke-static {p1}, Ll/ۙ᩷ܿ;->ۧ(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Ll/ۗ᩷ܿ;->᩶:I

    return-void
.end method

.method public static ֫(ILjava/lang/String;)Ll/ۗ᩷ܿ;
    .locals 3

    const-string v0, "parseColor("

    .line 23
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, " "

    const-string v1, ""

    .line 24
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 26
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "::"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 27
    sget-object v1, Ll/ۗ᩷ܿ;->ۗ:Ll/ۧۤᩴ;

    invoke-virtual {v1, v0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗ᩷ܿ;

    if-nez v2, :cond_1

    .line 29
    new-instance v2, Ll/ۗ᩷ܿ;

    invoke-direct {v2, p1, p0}, Ll/ۗ᩷ܿ;-><init>(Ljava/lang/String;I)V

    .line 30
    invoke-virtual {v1, v0, v2}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v2
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 11
    check-cast p1, Ll/ۗ᩷ܿ;

    .line 54
    iget v0, p0, Ll/ۗ᩷ܿ;->᩹:I

    iget p1, p1, Ll/ۗ᩷ܿ;->᩹:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 60
    const-class v2, Ll/ۗ᩷ܿ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 61
    :cond_1
    check-cast p1, Ll/ۗ᩷ܿ;

    .line 62
    iget v2, p0, Ll/ۗ᩷ܿ;->᩹:I

    iget v3, p1, Ll/ۗ᩷ܿ;->᩹:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ll/ۗ᩷ܿ;->ۙ:Ljava/lang/String;

    iget-object p1, p1, Ll/ۗ᩷ܿ;->ۙ:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 4

    .line 67
    iget v0, p0, Ll/ۗ᩷ܿ;->᩹:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Ll/ۗ᩷ܿ;->ۙ:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aput-object v0, v1, v2

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final ֫()Ll/ۡۜܿ;
    .locals 1

    .line 49
    iget-object v0, p0, Ll/ۗ᩷ܿ;->᩸:Ll/ۡۜܿ;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
