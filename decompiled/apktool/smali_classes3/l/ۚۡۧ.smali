.class public final Ll/ۚۡۧ;
.super Ljava/lang/Object;
.source "Z8II"

# interfaces
.implements Ll/᩸᩷ۧ;


# instance fields
.field public final ᩸:Ll/᩸᩷ۧ;

.field public final ᩹:J


# direct methods
.method public constructor <init>(JLl/᩸᩷ۧ;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-wide p1, p0, Ll/ۚۡۧ;->᩹:J

    .line 42
    iput-object p3, p0, Ll/ۚۡۧ;->᩸:Ll/᩸᩷ۧ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۚۡۧ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۚۡۧ;->᩹:J

    return-wide v0
.end method


# virtual methods
.method public final ֫(II)Ll/᩵ۢۧ;
    .locals 1

    .line 47
    iget-object v0, p0, Ll/ۚۡۧ;->᩸:Ll/᩸᩷ۧ;

    invoke-interface {v0, p1, p2}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۢۢۧ;)V
    .locals 1

    .line 57
    new-instance v0, Ll/֡ۡۧ;

    invoke-direct {v0, p0, p1, p1}, Ll/֡ۡۧ;-><init>(Ll/ۚۡۧ;Ll/ۢۢۧ;Ll/ۢۢۧ;)V

    iget-object p1, p0, Ll/ۚۡۧ;->᩸:Ll/᩸᩷ۧ;

    invoke-interface {p1, v0}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    return-void
.end method

.method public final ܳ()V
    .locals 1

    .line 52
    iget-object v0, p0, Ll/ۚۡۧ;->᩸:Ll/᩸᩷ۧ;

    invoke-interface {v0}, Ll/᩸᩷ۧ;->ܳ()V

    return-void
.end method
