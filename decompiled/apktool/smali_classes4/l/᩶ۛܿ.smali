.class public final synthetic Ll/᩶ۛܿ;
.super Ljava/lang/Object;
.source "C4QU"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:J

.field public final synthetic ᩸:Ll/ۨۛܿ;

.field public final synthetic ᩹:Ll/ۤۛܿ;


# direct methods
.method public synthetic constructor <init>(Ll/ۨۛܿ;Ll/ۤۛܿ;J)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶ۛܿ;->᩸:Ll/ۨۛܿ;

    iput-object p2, p0, Ll/᩶ۛܿ;->᩹:Ll/ۤۛܿ;

    iput-wide p3, p0, Ll/᩶ۛܿ;->᩶:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 0
    iget-object v0, p0, Ll/᩶ۛܿ;->᩹:Ll/ۤۛܿ;

    iget-wide v1, p0, Ll/᩶ۛܿ;->᩶:J

    iget-object v3, p0, Ll/᩶ۛܿ;->᩸:Ll/ۨۛܿ;

    invoke-static {v3, v0, v1, v2}, Ll/ܳۨܿ;->֫(Ll/ۨۛܿ;Ll/ۤۛܿ;J)V

    return-void
.end method
