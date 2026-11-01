package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۠ۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56XR */
/* JADX INFO: loaded from: classes3.dex */
public final class C10056 {
    /* JADX INFO: renamed from: ۧ */
    public static JSONObject m23428() {
        return C9417.m21913("type", "array", "description", "Non-fatal metadata, cleanup, or notification degradation.").add("items", C3935.m7775("string", "One warning message."));
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m23427() {
        return C3935.m7765("Result for mt_apk_copy_entry. data identifies the copied raw payload, the normalized local path, and any warnings. For workspace_to_local, nextActions checks destination file metadata; for local_to_edit_session, it reads up to the first 256 bytes. Neither action verifies the complete copied content; a corrupt workspace may return mt_apk_workspace_open for retry.", C20175.m45657(JSON.object().add("direction", C3935.m7769("Completed copy direction.", "workspace_to_local", "local_to_edit_session")).add("workspaceId", C3935.m7775("string", "Workspace containing the source or destination entry.")).add("editSessionId", C3935.m7775("string", "Empty for a base workspace read; otherwise the observed or modified edit session.")).add("locator", C3935.m7775("string", "Copied ordinary zip_entry locator.")).add("localPath", C3935.m7775("string", "Normalized absolute local source or destination path fixed for this call.")).add("warnings", m23428()), "integer", "Number of bytes copied.", "size", "Successful workspace entry payload copy."), C3935.m7770(C3935.m7762(JSON.object().add("direction", C3935.m7772("string", "Requested direction, or null when it could not be parsed.")).add("workspaceId", C3935.m7772("string", "Workspace id, or null for an argument error.")).add("editSessionId", C3935.m7772("string", "Edit session id, including an empty base sentinel, or null.")).add("locator", C3935.m7772("string", "Normalized zip_entry locator, or null when unavailable.")).add("localPath", C3935.m7772("string", "Normalized absolute local path, or null before path resolution.")).add("changed", C3935.m7775(ClassTransform.BOOLEAN, "Whether the logical destination may already have changed.")).add("operationMode", C3935.m7772("string", "atomic or best_effort when a publication guarantee was selected.")).add("stateKnown", C3935.m7775(ClassTransform.BOOLEAN, "Whether the final destination state is known.")).add("warnings", m23428()).add("bytesCopied", C3935.m7772("integer", "Bytes copied before failure; this does not mean those bytes reached the destination. Null when unknown.")).add("safeToRetry", C3935.m7775(ClassTransform.BOOLEAN, "Whether retrying the same copy arguments is safe.")), "Stable workspace entry copy failure context; unavailable values are null.")), C3935.m7768("Success returns mt_file_stat for the local destination or mt_apk_read_bytes for up to the first 256 entry bytes. Neither checks complete content equality. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open for retry.", C3935.m7763(C20175.m45657(JSON.object(), "string", "Normalized absolute copied local destination path.", MotionUtils.EASING_TYPE_PATH, "Arguments for mt_file_stat."), "mt_file_stat", "inspect"), C3935.m7763(C12981.m29760(), "mt_apk_read_bytes", "inspect"), C3935.m7763(C12981.m29764(), "mt_apk_workspace_open", "retry")));
    }
}
