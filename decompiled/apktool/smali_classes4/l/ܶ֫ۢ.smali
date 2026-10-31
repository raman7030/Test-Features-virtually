.class public final synthetic Ll/ܶ֫ۢ;
.super Ljava/lang/Object;
.source "06PO"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:Ljava/lang/Runnable;

.field public final synthetic ۙ:Ll/ۡ᩹ۡ;

.field public final synthetic ᩶:J

.field public final synthetic ᩸:Ll/ۗ֫ۢ;

.field public final synthetic ᩹:J


# direct methods
.method public synthetic constructor <init>(Ll/ۗ֫ۢ;JJLl/ۡ᩹ۡ;Ljava/lang/Runnable;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶ֫ۢ;->᩸:Ll/ۗ֫ۢ;

    iput-wide p2, p0, Ll/ܶ֫ۢ;->᩹:J

    iput-wide p4, p0, Ll/ܶ֫ۢ;->᩶:J

    iput-object p6, p0, Ll/ܶ֫ۢ;->ۙ:Ll/ۡ᩹ۡ;

    iput-object p7, p0, Ll/ܶ֫ۢ;->ۗ:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 0
    iget-object v5, p0, Ll/ܶ֫ۢ;->ۙ:Ll/ۡ᩹ۡ;

    iget-object v6, p0, Ll/ܶ֫ۢ;->ۗ:Ljava/lang/Runnable;

    iget-object v0, p0, Ll/ܶ֫ۢ;->᩸:Ll/ۗ֫ۢ;

    iget-wide v1, p0, Ll/ܶ֫ۢ;->᩹:J

    iget-wide v3, p0, Ll/ܶ֫ۢ;->᩶:J

    invoke-static/range {v0 .. v6}, Ll/ۗ֫ۢ;->֫(Ll/ۗ֫ۢ;JJLl/ۡ᩹ۡ;Ljava/lang/Runnable;)V

    return-void
.end method
