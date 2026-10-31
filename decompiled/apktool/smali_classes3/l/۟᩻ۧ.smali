.class public final synthetic Ll/۟᩻ۧ;
.super Ljava/lang/Object;
.source "E8P4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:J

.field public final synthetic ᩸:Ll/ۧۜۧ;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(IJLl/ۧۜۧ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Ll/۟᩻ۧ;->᩸:Ll/ۧۜۧ;

    iput p1, p0, Ll/۟᩻ۧ;->᩹:I

    iput-wide p2, p0, Ll/۟᩻ۧ;->᩶:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 0
    iget v0, p0, Ll/۟᩻ۧ;->᩹:I

    iget-wide v1, p0, Ll/۟᩻ۧ;->᩶:J

    iget-object v3, p0, Ll/۟᩻ۧ;->᩸:Ll/ۧۜۧ;

    invoke-static {v0, v1, v2, v3}, Ll/ۧۜۧ;->ۧ(IJLl/ۧۜۧ;)V

    return-void
.end method
