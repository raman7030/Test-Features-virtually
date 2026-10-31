.class public final synthetic Ll/ܰ᩻ۧ;
.super Ljava/lang/Object;
.source "E8P4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:J

.field public final synthetic ᩶:J

.field public final synthetic ᩸:Ll/ۧۜۧ;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/ۧۜۧ;Ljava/lang/String;JJ)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰ᩻ۧ;->᩸:Ll/ۧۜۧ;

    iput-object p2, p0, Ll/ܰ᩻ۧ;->᩹:Ljava/lang/String;

    iput-wide p3, p0, Ll/ܰ᩻ۧ;->᩶:J

    iput-wide p5, p0, Ll/ܰ᩻ۧ;->ۙ:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 0
    iget-wide v2, p0, Ll/ܰ᩻ۧ;->᩶:J

    iget-wide v4, p0, Ll/ܰ᩻ۧ;->ۙ:J

    iget-object v0, p0, Ll/ܰ᩻ۧ;->᩸:Ll/ۧۜۧ;

    iget-object v1, p0, Ll/ܰ᩻ۧ;->᩹:Ljava/lang/String;

    invoke-static/range {v0 .. v5}, Ll/ۧۜۧ;->֫(Ll/ۧۜۧ;Ljava/lang/String;JJ)V

    return-void
.end method
