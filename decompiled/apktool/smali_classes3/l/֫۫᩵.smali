.class public final Ll/֫۫᩵;
.super Ll/۟۬᩵;
.source "HAYQ"


# instance fields
.field public final ۗ:Ll/ۖۗ᩵;

.field public final ۤ:Ll/ۧ۫᩵;

.field public final ۫:Ljava/lang/Object;

.field public final ۬:Ll/ᩳ۫᩵;


# direct methods
.method public constructor <init>(Ll/ᩳ۫᩵;Ll/ۧ۫᩵;Ll/ۖۗ᩵;Ljava/lang/Object;)V
    .locals 0

    .line 1153
    invoke-direct {p0}, Ll/۟۬᩵;-><init>()V

    .line 1149
    iput-object p1, p0, Ll/֫۫᩵;->۬:Ll/ᩳ۫᩵;

    .line 1150
    iput-object p2, p0, Ll/֫۫᩵;->ۤ:Ll/ۧ۫᩵;

    .line 1151
    iput-object p3, p0, Ll/֫۫᩵;->ۗ:Ll/ۖۗ᩵;

    .line 1152
    iput-object p4, p0, Ll/֫۫᩵;->۫:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1148
    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Ll/֫۫᩵;->ۧ(Ljava/lang/Throwable;)V

    sget-object p1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    return-object p1
.end method

.method public final ۧ(Ljava/lang/Throwable;)V
    .locals 3

    .line 1155
    iget-object p1, p0, Ll/֫۫᩵;->ۗ:Ll/ۖۗ᩵;

    iget-object v0, p0, Ll/֫۫᩵;->۫:Ljava/lang/Object;

    iget-object v1, p0, Ll/֫۫᩵;->۬:Ll/ᩳ۫᩵;

    iget-object v2, p0, Ll/֫۫᩵;->ۤ:Ll/ۧ۫᩵;

    invoke-static {v1, v2, p1, v0}, Ll/ᩳ۫᩵;->֫(Ll/ᩳ۫᩵;Ll/ۧ۫᩵;Ll/ۖۗ᩵;Ljava/lang/Object;)V

    return-void
.end method
