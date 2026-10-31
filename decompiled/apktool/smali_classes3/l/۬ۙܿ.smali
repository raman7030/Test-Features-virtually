.class public final enum Ll/۬ۙܿ;
.super Ljava/lang/Enum;
.source "59CN"


# static fields
.field public static final enum ۗ:Ll/۬ۙܿ;

.field public static final synthetic ۙ:[Ll/۬ۙܿ;

.field public static final enum ۫:Ll/۬ۙܿ;

.field public static final enum ۬:Ll/۬ۙܿ;


# instance fields
.field public final ᩶:Z

.field public final ᩸:I

.field public final ᩹:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    .line 8
    new-instance v6, Ll/۬ۙܿ;

    const/4 v7, 0x1

    const v5, 0x7f1203f7

    const-string v1, "PREFER_SHOW_ALL"

    const/4 v2, 0x0

    const/4 v8, 0x1

    move-object v0, v6

    move v3, v8

    move v4, v7

    invoke-direct/range {v0 .. v5}, Ll/۬ۙܿ;-><init>(Ljava/lang/String;IZZI)V

    sput-object v6, Ll/۬ۙܿ;->ۗ:Ll/۬ۙܿ;

    .line 9
    new-instance v6, Ll/۬ۙܿ;

    const/4 v9, 0x0

    const v5, 0x7f1203f9

    const-string v1, "PREFER_SHOW_TITLE_ONLY"

    move-object v0, v6

    move v2, v8

    move v3, v7

    move v4, v9

    invoke-direct/range {v0 .. v5}, Ll/۬ۙܿ;-><init>(Ljava/lang/String;IZZI)V

    sput-object v6, Ll/۬ۙܿ;->۫:Ll/۬ۙܿ;

    .line 10
    new-instance v6, Ll/۬ۙܿ;

    const/4 v4, 0x1

    const v5, 0x7f1203f8

    const-string v1, "PREFER_SHOW_ICON_ONLY"

    const/4 v2, 0x2

    move-object v0, v6

    move v3, v9

    invoke-direct/range {v0 .. v5}, Ll/۬ۙܿ;-><init>(Ljava/lang/String;IZZI)V

    sput-object v6, Ll/۬ۙܿ;->۬:Ll/۬ۙܿ;

    .line 7
    invoke-static {}, Ll/۬ۙܿ;->֫()[Ll/۬ۙܿ;

    move-result-object v0

    sput-object v0, Ll/۬ۙܿ;->ۙ:[Ll/۬ۙܿ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IZZI)V
    .locals 0

    .line 16
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    iput-boolean p3, p0, Ll/۬ۙܿ;->᩶:Z

    .line 18
    iput-boolean p4, p0, Ll/۬ۙܿ;->᩹:Z

    .line 19
    iput p5, p0, Ll/۬ۙܿ;->᩸:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/۬ۙܿ;
    .locals 1

    .line 7
    const-class v0, Ll/۬ۙܿ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/۬ۙܿ;

    return-object p0
.end method

.method public static values()[Ll/۬ۙܿ;
    .locals 1

    .line 7
    sget-object v0, Ll/۬ۙܿ;->ۙ:[Ll/۬ۙܿ;

    invoke-virtual {v0}, [Ll/۬ۙܿ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/۬ۙܿ;

    return-object v0
.end method

.method public static synthetic ֫()[Ll/۬ۙܿ;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ll/۬ۙܿ;

    .line 7
    sget-object v1, Ll/۬ۙܿ;->ۗ:Ll/۬ۙܿ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/۬ۙܿ;->۫:Ll/۬ۙܿ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/۬ۙܿ;->۬:Ll/۬ۙܿ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 25
    iget v0, p0, Ll/۬ۙܿ;->᩸:I

    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
