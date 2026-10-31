.class public final Ll/ۗۧۘ;
.super Ll/ۙۧۘ;
.source "A9E1"


# static fields
.field public static final ۧ:Ll/֫᩻֨;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 25
    const-class v0, Ll/ۗۧۘ;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ۗۧۘ;->ۧ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠֫ۘ;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final ۧ(Ll/۠֫ۘ;)V
    .locals 2

    .line 34
    sget-object v0, Ll/ۗۧۘ;->ۧ:Ll/֫᩻֨;

    const-string v1, "Packet << {} >> ended up in dead letters"

    invoke-interface {v0, p1, v1}, Ll/֫᩻֨;->ᩳ(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
