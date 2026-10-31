.class public final Ll/᩷ᩴۧ;
.super Ljava/lang/Object;
.source "58LM"


# static fields
.field public static final ܽ:Ll/᩷ᩴۧ;


# instance fields
.field public final ֫:Z

.field public final ۧ:J


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 96
    new-instance v0, Ll/᩷ᩴۧ;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Ll/᩷ᩴۧ;-><init>(JZ)V

    sput-object v0, Ll/᩷ᩴۧ;->ܽ:Ll/᩷ᩴۧ;

    return-void
.end method

.method public constructor <init>(JZ)V
    .locals 0

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 113
    iput-wide p1, p0, Ll/᩷ᩴۧ;->ۧ:J

    .line 114
    iput-boolean p3, p0, Ll/᩷ᩴۧ;->֫:Z

    return-void
.end method

.method public static bridge synthetic ֫()Ll/᩷ᩴۧ;
    .locals 1

    .line 0
    sget-object v0, Ll/᩷ᩴۧ;->ܽ:Ll/᩷ᩴۧ;

    return-object v0
.end method

.method public static ֫(J)Ll/᩷ᩴۧ;
    .locals 2

    .line 140
    new-instance v0, Ll/᩷ᩴۧ;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Ll/᩷ᩴۧ;-><init>(JZ)V

    return-object v0
.end method

.method public static ۧ()Ll/᩷ᩴۧ;
    .locals 1

    .line 119
    sget-object v0, Ll/᩷ᩴۧ;->ܽ:Ll/᩷ᩴۧ;

    return-object v0
.end method
