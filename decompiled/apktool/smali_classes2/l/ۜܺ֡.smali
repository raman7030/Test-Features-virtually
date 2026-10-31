.class public final enum Ll/ۜܺ֡;
.super Ljava/lang/Enum;
.source "X4TD"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic ᩸:[Ll/ۜܺ֡;

.field public static final enum ᩹:Ll/ۜܺ֡;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 471
    new-instance v0, Ll/ۜܺ֡;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/ۜܺ֡;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ۜܺ֡;->᩹:Ll/ۜܺ֡;

    const/4 v1, 0x1

    new-array v1, v1, [Ll/ۜܺ֡;

    aput-object v0, v1, v2

    .line 469
    sput-object v1, Ll/ۜܺ֡;->᩸:[Ll/ۜܺ֡;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 470
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ۜܺ֡;
    .locals 1

    .line 469
    const-class v0, Ll/ۜܺ֡;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ۜܺ֡;

    return-object p0
.end method

.method public static values()[Ll/ۜܺ֡;
    .locals 1

    .line 469
    sget-object v0, Ll/ۜܺ֡;->᩸:[Ll/ۜܺ֡;

    invoke-virtual {v0}, [Ll/ۜܺ֡;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۜܺ֡;

    return-object v0
.end method


# virtual methods
.method public compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 481
    check-cast p1, Ljava/lang/Comparable;

    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method
