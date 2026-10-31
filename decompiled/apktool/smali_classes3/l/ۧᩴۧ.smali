.class public final Ll/ۧᩴۧ;
.super Ljava/lang/Object;
.source "88N4"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ᩸:[B

.field public final ᩹:J


# direct methods
.method public constructor <init>(J[B)V
    .locals 0

    .line 305
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 306
    iput-wide p1, p0, Ll/ۧᩴۧ;->᩹:J

    .line 307
    iput-object p3, p0, Ll/ۧᩴۧ;->᩸:[B

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۧᩴۧ;)[B
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۧᩴۧ;->᩸:[B

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۧᩴۧ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۧᩴۧ;->᩹:J

    return-wide v0
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 4

    .line 301
    check-cast p1, Ll/ۧᩴۧ;

    .line 312
    iget-wide v0, p0, Ll/ۧᩴۧ;->᩹:J

    iget-wide v2, p1, Ll/ۧᩴۧ;->᩹:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    move-result p1

    return p1
.end method
