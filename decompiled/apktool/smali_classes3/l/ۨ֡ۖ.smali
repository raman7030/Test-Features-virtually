.class public final Ll/ۨ֡ۖ;
.super Ljava/lang/Object;
.source "S9PM"


# static fields
.field public static final ܽ:Ll/ۨ֡ۖ;


# instance fields
.field public final ֫:Ll/ۧۤᩴ;

.field public final ۧ:Ll/᩸᩵ۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 23
    new-instance v0, Ll/ۨ֡ۖ;

    invoke-direct {v0}, Ll/ۨ֡ۖ;-><init>()V

    sput-object v0, Ll/ۨ֡ۖ;->ܽ:Ll/ۨ֡ۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    iput-object v0, p0, Ll/ۨ֡ۖ;->֫:Ll/ۧۤᩴ;

    .line 116
    new-instance v0, Ll/᩸᩵ۖ;

    invoke-direct {v0}, Ll/᩸᩵ۖ;-><init>()V

    iput-object v0, p0, Ll/ۨ֡ۖ;->ۧ:Ll/᩸᩵ۖ;

    return-void
.end method

.method public static ֫()Ll/ۨ֡ۖ;
    .locals 1

    .line 33
    sget-object v0, Ll/ۨ֡ۖ;->ܽ:Ll/ۨ֡ۖ;

    return-object v0
.end method


# virtual methods
.method public final ֫(Ljava/lang/Class;)Ll/ۢۚۖ;
    .locals 2

    const-string v0, "messageType"

    .line 64
    invoke-static {p1, v0}, Ll/ܰᩴۖ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    iget-object v0, p0, Ll/ۨ֡ۖ;->֫:Ll/ۧۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۢۚۖ;

    if-nez v1, :cond_0

    .line 68
    iget-object v1, p0, Ll/ۨ֡ۖ;->ۧ:Ll/᩸᩵ۖ;

    invoke-virtual {v1, p1}, Ll/᩸᩵ۖ;->֫(Ljava/lang/Class;)Ll/ۢۚۖ;

    move-result-object v1

    .line 96
    invoke-virtual {v0, p1, v1}, Ll/ۧۤᩴ;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۢۚۖ;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    return-object v1
.end method
