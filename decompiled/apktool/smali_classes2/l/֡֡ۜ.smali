.class public final synthetic Ll/֡֡ۜ;
.super Ljava/lang/Object;
.source "18PZ"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:J

.field public final synthetic ۙ:Ll/ܶ᩸ۜ;

.field public final synthetic ᩶:Ll/ۧ᩵֫;

.field public final synthetic ᩸:Ll/۠֡ۜ;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/۠֡ۜ;ILl/ۧ᩵֫;Ll/ܶ᩸ۜ;J)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡֡ۜ;->᩸:Ll/۠֡ۜ;

    iput p2, p0, Ll/֡֡ۜ;->᩹:I

    iput-object p3, p0, Ll/֡֡ۜ;->᩶:Ll/ۧ᩵֫;

    iput-object p4, p0, Ll/֡֡ۜ;->ۙ:Ll/ܶ᩸ۜ;

    iput-wide p5, p0, Ll/֡֡ۜ;->ۗ:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 0
    iget-object v3, p0, Ll/֡֡ۜ;->ۙ:Ll/ܶ᩸ۜ;

    iget-wide v4, p0, Ll/֡֡ۜ;->ۗ:J

    iget-object v0, p0, Ll/֡֡ۜ;->᩸:Ll/۠֡ۜ;

    iget v1, p0, Ll/֡֡ۜ;->᩹:I

    iget-object v2, p0, Ll/֡֡ۜ;->᩶:Ll/ۧ᩵֫;

    invoke-static/range {v0 .. v5}, Ll/۠֡ۜ;->֫(Ll/۠֡ۜ;ILl/ۧ᩵֫;Ll/ܶ᩸ۜ;J)V

    return-void
.end method
