.class public final enum Ll/ۡ֫᩵;
.super Ljava/lang/Enum;
.source "N673"


# static fields
.field public static final enum DOUBLE_VALUE:Ll/ۡ֫᩵;

.field public static final enum INT_VALUE:Ll/ۡ֫᩵;

.field public static final enum LONG_VALUE:Ll/ۡ֫᩵;

.field public static final enum REFERENCE:Ll/ۡ֫᩵;

.field public static final synthetic a:[Ll/ۡ֫᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    .line 55
    new-instance v0, Ll/ۡ֫᩵;

    const-string v1, "REFERENCE"

    const/4 v2, 0x0

    .line 50
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 55
    sput-object v0, Ll/ۡ֫᩵;->REFERENCE:Ll/ۡ֫᩵;

    .line 60
    new-instance v1, Ll/ۡ֫᩵;

    const-string v3, "INT_VALUE"

    const/4 v4, 0x1

    .line 50
    invoke-direct {v1, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 60
    sput-object v1, Ll/ۡ֫᩵;->INT_VALUE:Ll/ۡ֫᩵;

    .line 65
    new-instance v3, Ll/ۡ֫᩵;

    const-string v5, "LONG_VALUE"

    const/4 v6, 0x2

    .line 50
    invoke-direct {v3, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 65
    sput-object v3, Ll/ۡ֫᩵;->LONG_VALUE:Ll/ۡ֫᩵;

    .line 70
    new-instance v5, Ll/ۡ֫᩵;

    const-string v7, "DOUBLE_VALUE"

    const/4 v8, 0x3

    .line 50
    invoke-direct {v5, v7, v8}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 70
    sput-object v5, Ll/ۡ֫᩵;->DOUBLE_VALUE:Ll/ۡ֫᩵;

    const/4 v7, 0x4

    new-array v7, v7, [Ll/ۡ֫᩵;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    .line 50
    sput-object v7, Ll/ۡ֫᩵;->a:[Ll/ۡ֫᩵;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ۡ֫᩵;
    .locals 1

    .line 50
    const-class v0, Ll/ۡ֫᩵;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ۡ֫᩵;

    return-object p0
.end method

.method public static values()[Ll/ۡ֫᩵;
    .locals 1

    .line 50
    sget-object v0, Ll/ۡ֫᩵;->a:[Ll/ۡ֫᩵;

    invoke-virtual {v0}, [Ll/ۡ֫᩵;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۡ֫᩵;

    return-object v0
.end method
