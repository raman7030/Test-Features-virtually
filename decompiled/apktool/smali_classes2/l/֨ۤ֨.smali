.class public final enum Ll/֨ۤ֨;
.super Ljava/lang/Enum;
.source "6428"


# static fields
.field public static final enum ۗ:Ll/֨ۤ֨;

.field public static final enum ۙ:Ll/֨ۤ֨;

.field public static final synthetic ᩶:[Ll/֨ۤ֨;


# instance fields
.field public final ᩸:Ljava/lang/String;

.field public final ᩹:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 304
    new-instance v0, Ll/֨ۤ֨;

    const/4 v1, 0x0

    const-string v2, "var.might.already.be.assigned"

    const-string v3, "NORMAL"

    invoke-direct {v0, v3, v1, v2, v1}, Ll/֨ۤ֨;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Ll/֨ۤ֨;->ۙ:Ll/֨ۤ֨;

    .line 309
    new-instance v0, Ll/֨ۤ֨;

    const/4 v1, 0x1

    const-string v2, "var.might.be.assigned.in.loop"

    const-string v3, "SPECULATIVE_LOOP"

    invoke-direct {v0, v3, v1, v2, v1}, Ll/֨ۤ֨;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Ll/֨ۤ֨;->ۗ:Ll/֨ۤ֨;

    .line 300
    invoke-static {}, Ll/֨ۤ֨;->ۧ()[Ll/֨ۤ֨;

    move-result-object v0

    sput-object v0, Ll/֨ۤ֨;->᩶:[Ll/֨ۤ֨;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Z)V
    .locals 0

    .line 314
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 315
    iput-object p3, p0, Ll/֨ۤ֨;->᩸:Ljava/lang/String;

    .line 316
    iput-boolean p4, p0, Ll/֨ۤ֨;->᩹:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/֨ۤ֨;
    .locals 1

    .line 300
    const-class v0, Ll/֨ۤ֨;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/֨ۤ֨;

    return-object p0
.end method

.method public static values()[Ll/֨ۤ֨;
    .locals 1

    .line 300
    sget-object v0, Ll/֨ۤ֨;->᩶:[Ll/֨ۤ֨;

    invoke-virtual {v0}, [Ll/֨ۤ֨;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/֨ۤ֨;

    return-object v0
.end method

.method public static synthetic ۧ()[Ll/֨ۤ֨;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ll/֨ۤ֨;

    .line 300
    sget-object v1, Ll/֨ۤ֨;->ۙ:Ll/֨ۤ֨;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/֨ۤ֨;->ۗ:Ll/֨ۤ֨;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public ֫()Z
    .locals 1

    .line 320
    iget-boolean v0, p0, Ll/֨ۤ֨;->᩹:Z

    return v0
.end method
