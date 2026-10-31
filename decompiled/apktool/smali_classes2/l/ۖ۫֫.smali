.class public final synthetic Ll/ۖ۫֫;
.super Ljava/lang/Object;
.source "L8RI"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:J

.field public final synthetic ᩶:J

.field public final synthetic ᩸:Ll/֡۫֫;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/֡۫֫;IJJ)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖ۫֫;->᩸:Ll/֡۫֫;

    iput p2, p0, Ll/ۖ۫֫;->᩹:I

    iput-wide p3, p0, Ll/ۖ۫֫;->᩶:J

    iput-wide p5, p0, Ll/ۖ۫֫;->ۙ:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 0
    iget-wide v2, p0, Ll/ۖ۫֫;->᩶:J

    iget-wide v4, p0, Ll/ۖ۫֫;->ۙ:J

    iget-object v0, p0, Ll/ۖ۫֫;->᩸:Ll/֡۫֫;

    iget v1, p0, Ll/ۖ۫֫;->᩹:I

    invoke-static/range {v0 .. v5}, Ll/֡۫֫;->֫(Ll/֡۫֫;IJJ)V

    return-void
.end method
