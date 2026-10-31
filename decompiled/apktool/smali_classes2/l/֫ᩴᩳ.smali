.class public final synthetic Ll/֫ᩴᩳ;
.super Ljava/lang/Object;
.source "16RW"

# interfaces
.implements Ll/۠ۜ᩵;


# instance fields
.field public final synthetic ᩶:[B

.field public final synthetic ᩸:Ll/ܽᩴᩳ;

.field public final synthetic ᩹:J


# direct methods
.method public synthetic constructor <init>(Ll/ܽᩴᩳ;J[B)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫ᩴᩳ;->᩸:Ll/ܽᩴᩳ;

    iput-wide p2, p0, Ll/֫ᩴᩳ;->᩹:J

    iput-object p4, p0, Ll/֫ᩴᩳ;->᩶:[B

    return-void
.end method


# virtual methods
.method public final ۧ(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 3

    .line 0
    check-cast p1, Ljava/lang/Long;

    iget-wide v0, p0, Ll/֫ᩴᩳ;->᩹:J

    iget-object p1, p0, Ll/֫ᩴᩳ;->᩸:Ll/ܽᩴᩳ;

    iget-object v2, p0, Ll/֫ᩴᩳ;->᩶:[B

    invoke-static {v0, v1, p1, p2, v2}, Ll/ܽᩴᩳ;->֫(JLl/ܽᩴᩳ;Ljava/lang/Throwable;[B)V

    return-void
.end method
