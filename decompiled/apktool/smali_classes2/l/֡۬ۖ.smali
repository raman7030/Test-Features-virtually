.class public final enum Ll/֡۬ۖ;
.super Ljava/lang/Enum;
.source "L9I7"


# static fields
.field public static final enum ۙ:Ll/֡۬ۖ;

.field public static final enum ᩶:Ll/֡۬ۖ;

.field public static final synthetic ᩹:[Ll/֡۬ۖ;


# instance fields
.field public ᩸:I


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 19
    new-instance v0, Ll/֡۬ۖ;

    const-string v1, "PRIMITIVE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Ll/֡۬ۖ;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ll/֡۬ۖ;->ۙ:Ll/֡۬ۖ;

    .line 20
    new-instance v1, Ll/֡۬ۖ;

    const/16 v3, 0x20

    const-string v4, "CONSTRUCTED"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v3}, Ll/֡۬ۖ;-><init>(Ljava/lang/String;II)V

    sput-object v1, Ll/֡۬ۖ;->᩶:Ll/֡۬ۖ;

    const/4 v3, 0x2

    new-array v3, v3, [Ll/֡۬ۖ;

    aput-object v0, v3, v2

    aput-object v1, v3, v5

    .line 18
    sput-object v3, Ll/֡۬ۖ;->᩹:[Ll/֡۬ۖ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 24
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 25
    iput p3, p0, Ll/֡۬ۖ;->᩸:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/֡۬ۖ;
    .locals 1

    .line 18
    const-class v0, Ll/֡۬ۖ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/֡۬ۖ;

    return-object p0
.end method

.method public static values()[Ll/֡۬ۖ;
    .locals 1

    .line 18
    sget-object v0, Ll/֡۬ۖ;->᩹:[Ll/֡۬ۖ;

    invoke-virtual {v0}, [Ll/֡۬ۖ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/֡۬ۖ;

    return-object v0
.end method

.method public static ֫(B)Ll/֡۬ۖ;
    .locals 0

    and-int/lit8 p0, p0, 0x20

    if-nez p0, :cond_0

    .line 34
    sget-object p0, Ll/֡۬ۖ;->ۙ:Ll/֡۬ۖ;

    return-object p0

    .line 36
    :cond_0
    sget-object p0, Ll/֡۬ۖ;->᩶:Ll/֡۬ۖ;

    return-object p0
.end method


# virtual methods
.method public getValue()I
    .locals 1

    .line 29
    iget v0, p0, Ll/֡۬ۖ;->᩸:I

    return v0
.end method
